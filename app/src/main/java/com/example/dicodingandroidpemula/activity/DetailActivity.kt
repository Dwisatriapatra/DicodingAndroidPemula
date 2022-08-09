package com.example.dicodingandroidpemula.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import com.example.dicodingandroidpemula.model.Berita
import com.example.dicodingandroidpemula.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var detailActivityBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailActivityBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailActivityBinding.root)

        initView()
    }

    private fun initView() {
        val listBerita = intent.getParcelableExtra<Berita>("data_berita")

        //initialize
        detailActivityBinding.detailGambar.setImageResource(listBerita!!.gambar)
        detailActivityBinding.detailJudul.text = listBerita.judul
        detailActivityBinding.detailPenulis.text = listBerita.penulis
        detailActivityBinding.detailTanggalTerbit.text = listBerita.tanggalTerbit
        detailActivityBinding.detailLinkBerita.text = listBerita.urlBerita
        detailActivityBinding.detailDeskripsi.text = listBerita.deskripsi
        detailActivityBinding.detailSumber.text = listBerita.sumber

        //open browser action
        detailActivityBinding.detailLinkBerita.movementMethod = LinkMovementMethod.getInstance()
    }
}