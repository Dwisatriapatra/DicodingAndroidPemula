package com.example.dicodingandroidpemula.activity

import android.content.Intent
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
        // ini
        val listBerita = ArrayList<Berita>()
        listBerita.add(
            Berita(
                "Golden opportunity’: Widodo’s China trip puts spotlight on trade",
                "Aisyah Llewellyn",
                "2022-07-15",
                "https://www.aljazeera.com/economy/2022/7/15/g20-finance-leaders-meet-in-bali-as-ukraine-inflation-top-agenda",
                "Al Jazeera English",
                R.drawable.berita_1,
                "Medan, Indonesia – The third G20 finance leaders and central bank governors meeting kicks off on the Indonesian island of Bali on Friday against the turbulent backdrop of war in Ukraine, soaring inflation and global food shortages. The previous G20 finance leaders’ meeting in Washington, DC, in April ended without the release of a communique and saw officials from the United States, the United Kingdom, France, Canada and Ukraine walk out of talks to protest the presence of Russian representatives..."
            )
        )
        listBerita.add(
            Berita(
                "Indonesiens neue Hauptstadt - grünste der Welt?",
                "tagesschau.de",
                "2022-08-01",
                "https://www.tagesschau.de/ausland/indonesien-borneo-101.html",
                "tagesschau.de",
                R.drawable.berita_2,
                "Ein blauer Würfel, eine goldene kreisförmige Plakette darauf, eine Warnung: nicht beschädigen, nicht entfernen, sonst 500 Millionen Rupien - also 30.000 Euro - Strafe. Der Titik Nol - übersetzt \"Nullpunkt\", auf Deutsch wohl Grundstein - für die neue Hauptstadt Indonesiens. Riesige weiße Lettern sind über dem runden Nullpunkt-Platz befestigt: \"Titik Nol Nusantara\" steht da. Nusantara soll die neue Hauptstadt heißen - \"Archipel\" -, wie Indonesien eben ein riesiger Archipel mit 17.000 Inseln ist. Außer dem blauen Würfel und weißer Schrift ist noch nicht viel zu sehen, trotzdem ist der \"Nullpunkt\" ein beliebtes Fotomotiv für die selfiefreudigen Indonesier, die posierenden Besucher gut bewacht von Militär und Geheimdienst."
            )
        )
        listBerita.add(
            Berita(
                "For G20, Ukraine war thwarts cooperation on global economy",
                "isyah Llewellyn",
                "022-07-19",
                "https://www.aljazeera.com/economy/2022/7/19/g20-finance-no-communique-amid-ukraine-war",
                "Al Jazeera English",
                R.drawable.berita_3,
                "Medan, Indonesia – When G20 finance ministers and central bank governors met in Bali on July 15-16, the summit raised hopes of coordinated action to tackle some of the thorniest issues facing the global economy. Those hopes withered over the weekend as divisions over the war in Ukraine scuppered any chance of a joint communique to address mounting challenges including soaring inflation, slowing economic growth and widespread shortages of food and goods."

            )
        )
        listBerita.add(
            Berita(
                "China's Xi to hold talks with Indonesia's Jokowi in rare visit",
                "Reuters",
                "022-07-26",
                "https://finance.yahoo.com/news/xi-meets-jokowi-beijing-indonesia-091134207.html?guccounter=1&guce_referrer=aHR0cHM6Ly9uZXdzYXBpLm9yZy8&guce_referrer_sig=AQAAAGm0lOirQZFH4nTJzPWcxJi6O1054695Hy-f-Jiq_10lWf9TbseIeYQWTRr1ie-bwoh4LPxjgpUVz0yKcemIxrQIJdDHtLz8lzFF8zOz8WNSXbXNa7QK-fgBU05LJ8b1A46pR0O-ZhnWI7XlUMuddNc_S0-SG36piSUozZi08KXA",
                "Yahoo Entertainment",
                R.drawable.berita_4,
                "(Bloomberg) -- Indonesian President Joko Widodo invited China’s Xi Jinping to attend the Group of 20 summit in November, as the two leaders held a rare meeting in Beijing amid strict Covid controls. Xi thanked the G-20 host for his invitation and wished him success, according to a statement from China’s Ministry of Foreign Affairs. But it was unclear whether he will attend. Jokowi’s trip to China marks the first by a foreign leader since the Olympics in February, when Russian President Vladimir Putin and others entered a bubble designed to keep visitors separate from the public. China’s zero-tolerance approach to the virus has largely kept foreign leaders out of the country during the pandemic, with Xi last leaving in January 2020."
            )
        )
        listBerita.add(
            Berita(
                "G20 women’s forum accused of excluding Indigenous Indonesians",
                "Aisyah Llewellyn",
                "022-07-20",
                "https://www.aljazeera.com/economy/2022/7/20/g20-womens-forum-accused-of-excluding-indigenous-indonesians",
                "Al Jazeera English",
                R.drawable.berita_5,
                "Medan, Indonesia – Indigenous and women’s rights groups in Indonesia are protesting against the G20’s headline event for gender equality over the alleged exclusion of local voices and failure to address key women’s issues in North Sumatra. Activists gathered at the site of the W20 Summit in Lake Toba, North Sumatra on Wednesday to call attention to deforestation and other issues they say have been neglected by the event taking place from 19-21 July."
            )
        )
        listBerita.add(
            Berita(
                "Indonesia’s PayPal, Yahoo bans cast cloud over tech hub dream",
                "Randy Mulyanto, Leo Galuh",
                "022-08-04",
                "https://www.aljazeera.com/economy/2022/8/4/indonesias-paypal-ban-casts-cloud-over-tech-hub-dreams",
                "Al Jazeera English",
                R.drawable.berita_6,
                "Jakarta, Indonesia – Indonesia’s temporary ban on major websites including PayPal has exposed the difficult balancing act Jakarta faces as it seeks to both tighten control of the internet and become Southeast Asia’s next tech hub. Indonesian President Joko “Jokowi” Widodo has listed digital infrastructure as a priority under his Making Indonesia 4.0 roadmap aimed at lifting his country into the ranks of the world’s top 10 economies."
            )
        )
        listBerita.add(
            Berita(
                "Jadi Saksi Kerja Keras Jokowi, Prabowo: Karena Kurus Beliau Energik",
                "Anwar Sadat",
                "2022-08-05",
                "https://www.viva.co.id/berita/nasional/1506114-jadi-saksi-kerja-keras-jokowi-prabowo-karena-kurus-beliau-energik",
                "Viva.co.id",
                R.drawable.berita_7,
                "VIVA Nasional – Menteri Pertahanan RI Prabowo Subianto, memuji kinerja Presiden Joko Widodo dalam memimpin Indonesia yang dinilai telah bekerja dengan sangat keras. Sebagai Menteri Jokowi, Prabowo menyaksikan sendiri bagaimana cara kerja Jokowi memimpin Indonesia. Hal itu disampaikan Prabowo dalam acara Silaturahmi Nasional dan HUT ke 19 Persatuan Purnawirawan Angkatan Darat atau PPAD di Sentul International Convention Center, Jumat 5 Agustus 2022. Menurut Prabowo, Jokowi adalah salah satu pemimpin Indonesia yang bekerja paling keras."
            )
        )
        listBerita.add(
            Berita(
                "esok Jokowi ke Jepang akan Bertemu Kaisar Naruhito-Permaisuri Masako",
                "Ezra Sihite",
                "2022-07-26",
                "https://www.viva.co.id/berita/dunia/1502030-besok-jokowi-ke-jepang-akan-bertemu-kaisar-naruhito-permaisuri-masako",
                "Viva.co.id",
                R.drawable.berita_8,
                "VIVA Dunia – Presiden Joko Widodo akan mengunjungi Jepang pada Rabu (27/7/2022) dan dijadwalkan bertemu dengan Kaisar Naruhito dan Permaisuri Masako,  menurut keterangan dari Kedutaan Besar RI (KBRI) di Tokyo, Selasa. Pada hari yang sama, Presiden Jokowi juga akan berbicara dengan Perdana Menteri Fumio Kishida dan kalangan bisnis Jepang untuk membahas sejumlah kerja sama bilateral, terutama di bidang perdagangan dan investasi."
            )
        )
        listBerita.add(
            Berita(
                "Jokowi Ketemu Relawan di Istana Bogor, Ini Analisa Pengamat",
                "Agus Rahmat",
                "2022-07-29",
                "https://www.viva.co.id/berita/politik/1503651-jokowi-ketemu-relawan-di-istana-bogor-ini-analisa-pengamat",
                "Viva.co.id",
                R.drawable.berita_9,
                "VIVA Politik – Pertemuan Presiden Joko Widodo dengan relawan dan loyalis di Istana Kepresidenan Bogor, Jawa Barat pada Jumat siang, tetap dikaitkan dengan Pemilu 2024.  Pengamat politik Herry Mendrofa yang juga Direktur Eksekutif Centre For Indonesia Strategic Actions (CISA) menilai, ada sikap Jokowi yang terlihat hati-hati dan kalkulatif dalam menentukan sikap politik di tahun 2024 mendatang. Terlebih, posisinya saat ini masih menjabat sebagai Presiden RI."
            )
        )
        listBerita.add(
            Berita(
                "Indonesia bans access to Steam, Epic Games, PayPal, and more",
                "Emma Roth",
                "2022-07-30",
                "https://www.theverge.com/2022/7/30/23285091/indonesia-bans-access-steam-epic-games-paypal-yahoo",
                "The Verge",
                R.drawable.berita_10,
                "The Indonesian government has blocked access to a range of online services, including Steam, Epic Games, PayPal, and Yahoo after the companies failed to comply with a new requirement related to the country’s restrictive content moderation laws, as reported earlier by Reuters. In line with the rules, companies deemed “Private Electronic System Providers” must register with the government’s database to operate in the country, or otherwise face a nationwide ban. Indonesia gave companies until July 27th to comply and has since banned those that haven’t."
            )
        )

        beritaAdapter = BeritaAdapter {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data_berita", it)
            startActivity(intent)
        }
        mainActivityBinding.rvBerita.layoutManager = LinearLayoutManager(this)
        mainActivityBinding.rvBerita.adapter = beritaAdapter
        beritaAdapter.setListBerita(listBerita)
    }


}