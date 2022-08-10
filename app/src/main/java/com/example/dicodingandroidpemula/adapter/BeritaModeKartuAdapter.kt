package com.example.dicodingandroidpemula.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingandroidpemula.R
import com.example.dicodingandroidpemula.databinding.ItemBeritaModeKartuBinding
import com.example.dicodingandroidpemula.model.Berita
import com.squareup.picasso.Picasso

class BeritaModeKartuAdapter(private val onClick: (Berita) -> Unit) :
    RecyclerView.Adapter<BeritaModeKartuAdapter.ViewHolder>() {
    private var listBerita: ArrayList<Berita>? = null

    fun setListBerita(list: ArrayList<Berita>?) {
        listBerita = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemBeritaModeKartuBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita_mode_kartu, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.cardBeritaJudul.text = listBerita!![position].judul
            binding.cardBeritaPenulis.text = "Penulis: ${listBerita!![position].penulis}"
            binding.cardBeritaTanggalTerbit.text =
                "Tanggal terbit: ${listBerita!![position].tanggalTerbit}"
            Picasso.get().load(listBerita!![position].gambar).into(binding.cardBeritaGambar)
            binding.cardBerita.setOnClickListener {
                onClick(listBerita!![position])
            }
        }
    }

    override fun getItemCount(): Int {
        return if (listBerita.isNullOrEmpty()) {
            0
        } else {
            listBerita!!.size
        }
    }

}