package com.example.dicodingandroidpemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Berita(
    val judul: String,
    val penulis: String,
    val tanggalTerbit: String,
    val deskripsi: String,
    val urlBerita: String,
    val sumber: String
) : Parcelable
