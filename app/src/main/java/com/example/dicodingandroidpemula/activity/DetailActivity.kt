package com.example.dicodingandroidpemula.activity

import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dicodingandroidpemula.databinding.ActivityDetailBinding
import com.example.dicodingandroidpemula.model.Berita
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var detailActivityBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailActivityBinding = ActivityDetailBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detail"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#192A5F")))
        setContentView(detailActivityBinding.root)

        initView()
    }

    private fun initView() {
        val listBerita = intent.getParcelableExtra<Berita>("data_berita")

        //initialize
        detailActivityBinding.detailJudul.text = listBerita?.judul
        detailActivityBinding.detailPenulis.text = listBerita?.penulis
        detailActivityBinding.detailTanggalTerbit.text = listBerita?.tanggalTerbit
        detailActivityBinding.detailLinkBerita.text = listBerita?.urlBerita
        detailActivityBinding.detailLinkBerita.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        detailActivityBinding.detailDeskripsi.text = listBerita?.deskripsi
        detailActivityBinding.detailSumber.text = listBerita?.sumber
        Picasso.get().load(listBerita?.gambar).into(detailActivityBinding.detailGambar)

        //share action button
        detailActivityBinding.detailBagikanButton.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "Hai, ayo cek berita dengan judul \"${listBerita?.judul}\" pada tautan berikut ${listBerita?.urlBerita}"
            )
            startActivity(Intent.createChooser(intent, "Bagikan ke: "))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}