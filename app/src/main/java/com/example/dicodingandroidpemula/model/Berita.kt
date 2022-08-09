package com.example.dicodingandroidpemula.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Berita(
    val judul: String,
    val penulis: String,
    val tanggalTerbit: String,
    val urlBerita: String,
    val sumber: String,
    val gambar: Int,
    val deskripsi: String,
) : Parcelable
