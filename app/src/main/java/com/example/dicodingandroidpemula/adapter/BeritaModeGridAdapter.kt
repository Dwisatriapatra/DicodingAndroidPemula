package com.example.dicodingandroidpemula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingandroidpemula.R
import com.example.dicodingandroidpemula.databinding.ItemBeritaModeGridBinding
import com.example.dicodingandroidpemula.model.Berita
import com.squareup.picasso.Picasso

class BeritaModeGridAdapter(private val onClick: (Berita) -> Unit) :
    RecyclerView.Adapter<BeritaModeGridAdapter.ViewHolder>() {
    private var listBerita: ArrayList<Berita>? = null

    fun setListBerita(list: ArrayList<Berita>?) {
        listBerita = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemBeritaModeGridBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_berita_mode_grid, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            Picasso.get().load(listBerita!![position].gambar).into(binding.modeGridBeritaGambar)
            binding.modeGridBerita.setOnClickListener {
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