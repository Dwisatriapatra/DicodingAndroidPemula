package com.example.dicodingandroidpemula.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dicodingandroidpemula.R
import com.example.dicodingandroidpemula.adapter.BeritaAdapter
import com.example.dicodingandroidpemula.data.Berita
import com.example.dicodingandroidpemula.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityBinding: ActivityMainBinding
    private lateinit var beritaAdapter: BeritaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        initBeritaAdapter()
    }

    private fun initBeritaAdapter() {
        val data = ArrayList<Berita>()
        data.add(
            Berita(
                "Golden opportunity’: Widodo’s China trip puts spotlight on trade",
                "Aisyah Llewellyn",
                "2022-07-15",
                "https://www.aljazeera.com/economy/2022/7/15/g20-finance-leaders-meet-in-bali-as-ukraine-inflation-top-agenda",
                "Al Jazeera English",
                R.drawable.ic_launcher_background,
                "Medan, Indonesia – The third G20 finance leaders and central bank governors meeting kicks off on the Indonesian island of Bali on Friday against the turbulent backdrop of war in Ukraine, soaring inflation and global food shortages. The previous G20 finance leaders’ meeting in Washington, DC, in April ended without the release of a communique and saw officials from the United States, the United Kingdom, France, Canada and Ukraine walk out of talks to protest the presence of Russian representatives..."
            )
        )
        beritaAdapter = BeritaAdapter {
            //action on click
        }
        mainActivityBinding.rvBerita.layoutManager = LinearLayoutManager(this)
        mainActivityBinding.rvBerita.adapter = beritaAdapter
        beritaAdapter.setListBerita(data)
        beritaAdapter.notifyDataSetChanged()
    }


}