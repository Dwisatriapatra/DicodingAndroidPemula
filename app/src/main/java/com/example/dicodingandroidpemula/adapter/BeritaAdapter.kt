package com.example.dicodingandroidpemula.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingandroidpemula.R
import com.example.dicodingandroidpemula.model.Berita
import com.example.dicodingandroidpemula.databinding.ItemBeritaBinding

class BeritaAdapter (private val onClick: (Berita) -> Unit) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>(){
    private var listBerita: ArrayList<Berita>? = null

    fun setListBerita(list: ArrayList<Berita>?){
        listBerita = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemBeritaBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            binding.cardBeritaJudul.text = listBerita!![position].judul
            binding.cardBeritaPenulis.text = "Penulis: ${listBerita!![position].penulis}"
            binding.cardBeritaTanggalTerbit.text = "Tanggal terbit: ${listBerita!![position].tanggalTerbit}"
            binding.cardBeritaGambar.setImageResource(listBerita!![position].gambar)
            binding.cardBerita.setOnClickListener {
                onClick(listBerita!![position])
            }
        }
    }
    override fun getItemCount(): Int {
        return if(listBerita.isNullOrEmpty()){
            0
        }else{
            listBerita!!.size
        }
    }

}