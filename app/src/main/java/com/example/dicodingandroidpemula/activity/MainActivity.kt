package com.example.dicodingandroidpemula.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dicodingandroidpemula.R
import com.example.dicodingandroidpemula.adapter.BeritaModeGridAdapter
import com.example.dicodingandroidpemula.adapter.BeritaModeKartuAdapter
import com.example.dicodingandroidpemula.adapter.BeritaModeListAdapter
import com.example.dicodingandroidpemula.databinding.ActivityMainBinding
import com.example.dicodingandroidpemula.model.Berita

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityBinding: ActivityMainBinding
    private var listBerita = ArrayList<Berita>()
    private lateinit var beritaModeKartuAdapter: BeritaModeKartuAdapter
    private lateinit var beritaModeListAdapter: BeritaModeListAdapter
    private lateinit var beritaModeGridAdapter: BeritaModeGridAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.title = "Home (Mode Kartu)"
        setContentView(mainActivityBinding.root)

        initBeritaAdapter()
    }

    private fun initBeritaAdapter() {
        // init
        listBerita.add(
            Berita(
                "Golden opportunity’: Widodo’s China trip puts spotlight on trade",
                "Aisyah Llewellyn",
                "2022-07-15",
                "https://www.aljazeera.com/economy/2022/7/15/g20-finance-leaders-meet-in-bali-as-ukraine-inflation-top-agenda",
                "Al Jazeera English",
                "https://www.aljazeera.com/wp-content/uploads/2022/07/2019-06-28T123732Z_897468503_RC1D0ECB23E0_RTRMADP_3_G20-SUMMIT.jpg?resize=1200%2C630",
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
                "https://www.tagesschau.de/multimedia/bilder/nusantara-frauen-101~_v-original.jpg",
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
                "https://www.aljazeera.com/wp-content/uploads/2022/07/2022-07-16T060627Z_1530693829_RC2SCV9OR7EH_RTRMADP_3_G20-INDONESIA.jpg?resize=1200%2C630",
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
                "https://s.yimg.com/uu/api/res/1.2/KthGfWccOvztKP_99CHyUw--~B/aD01NTg7dz04MDA7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/en/reuters.com/84f4104a93bb0395bbab097674395a85",
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
                "https://www.aljazeera.com/wp-content/uploads/2022/07/GP1SXYCG_.jpg?resize=1200%2C630",
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
                "https://www.aljazeera.com/wp-content/uploads/2022/08/389829224.jpg?resize=1200%2C630",
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
                "https://thumb.viva.co.id/media/frontend/thumbs3/2022/05/07/62768abfad474-ketua-umum-partai-gerindra-prabowo-subianto-temui-presiden-jokowi-kiri_665_374.jpg",
                "VIVA Nasional – Menteri Pertahanan RI Prabowo Subianto, memuji kinerja Presiden Joko Widodo dalam memimpin Indonesia yang dinilai telah bekerja dengan sangat keras. Sebagai Menteri Jokowi, Prabowo menyaksikan sendiri bagaimana cara kerja Jokowi memimpin Indonesia. Hal itu disampaikan Prabowo dalam acara Silaturahmi Nasional dan HUT ke 19 Persatuan Purnawirawan Angkatan Darat atau PPAD di Sentul International Convention Center, Jumat 5 Agustus 2022. Menurut Prabowo, Jokowi adalah salah satu pemimpin Indonesia yang bekerja paling keras."
            )
        )
        listBerita.add(
            Berita(
                "Besok Jokowi ke Jepang akan Bertemu Kaisar Naruhito-Permaisuri Masako",
                "Ezra Sihite",
                "2022-07-26",
                "https://www.viva.co.id/berita/dunia/1502030-besok-jokowi-ke-jepang-akan-bertemu-kaisar-naruhito-permaisuri-masako",
                "Viva.co.id",
                "https://thumb.viva.co.id/media/frontend/thumbs3/2022/07/25/62de446f8499c-presiden-jokowi-bersama-iriana-jokowi_665_374.jpeg",
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
                "https://thumb.viva.co.id/media/frontend/thumbs3/2022/07/14/62cff830bd64c-presiden-jokowi-resmikan-wajah-baru-sarinah_665_374.jpg",
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
                "https://cdn.vox-cdn.com/thumbor/UjLcQjas-Ltb_kcBiRrfIQEA-vw=/0x146:2040x1214/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/10817781/acastro_180509_1777_steam_0002.jpg",
                "The Indonesian government has blocked access to a range of online services, including Steam, Epic Games, PayPal, and Yahoo after the companies failed to comply with a new requirement related to the country’s restrictive content moderation laws, as reported earlier by Reuters. In line with the rules, companies deemed “Private Electronic System Providers” must register with the government’s database to operate in the country, or otherwise face a nationwide ban. Indonesia gave companies until July 27th to comply and has since banned those that haven’t."
            )
        )
        listBerita.add(
            Berita(
                "Your Crunchyroll anime subscription just got cheaper in these 95 countries",
                "Sean Hollister",
                "022-07-18",
                "https://www.theverge.com/2022/7/18/23268979/crunchyroll-anime-price-cut-subscription",
                "The Verge",
                "https://cdn.vox-cdn.com/thumbor/LeRo9jVmviXtV8CYAUbgoUcv7a4=/0x0:1920x1005/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/23884819/a0cda947fb86e83388fb0819899504341657899753_main.jpg",
                "Now that Sony has successfully rolled Funimation into Crunchyroll in an attempt to create the one anime streaming service to rule them all, it’s leveraging that consolidation to raise prices, right? Wrong, apparently! The company just announced price cuts in 95 different territories around the world, including the UK, China, India, and many, many more."
            )
        )
        listBerita.add(
            Berita(
                "Digimon Adventure's Next Film Reunites Its Most Underrated DigiDestined",
                "Justin Carter",
                "2022-07-31",
                "https://gizmodo.com/digimon-adventure-02-film-the-beginning-1849352769",
                "Gizmodo.com",
                "https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/e3500be9d440c77ddad7daa416505c14.png",
                "Digimon isn’t quite the juggernaut it was back when us 90s kids were watching it early in the morning before school, but Toei has been gradually releasing more of it over the years. For anime fans, there was a reboot of the original Digimon Adventure season that premiered last year and whose English dub is currently in production. In addition to that anime, though, Toei also released two films that served as sequels to the original Adventure series, and now a new film is on the horizon to tie up its second season. The next film in the Adventure series was officially titled as Digimon Adventure 02 The Beginning at DigiFes 2022. Like how the first two films returned to the original DigiDestined kids as adults and closed out their story, The Beginning is intended to serve as a capper to the show’s second season. Yumeta Company, who worked on 2020's Adventure film, Last Evolution—Kizuna, is developing the film alongside Toei."
            )
        )
        setMode("mode_kartu")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_action_bar_home_go_to_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            R.id.action_cardview -> {
                setMode("mode_kartu")
                true
            }
            R.id.action_list -> {
                setMode("mode_list")
                true
            }
            R.id.action_grid -> {
                setMode("mode_grid")
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    private fun setMode(mode: String) {
        when (mode) {
            "mode_kartu" -> {
                beritaModeKartuAdapter = BeritaModeKartuAdapter {
                    val intent = Intent(this, DetailActivity::class.java)
                    intent.putExtra("data_berita", it)
                    startActivity(intent)
                }
                mainActivityBinding.rvBerita.layoutManager = LinearLayoutManager(this)
                mainActivityBinding.rvBerita.adapter = beritaModeKartuAdapter
                beritaModeKartuAdapter.setListBerita(listBerita)
                supportActionBar?.title = "Home (Mode Kartu)"
            }
            "mode_list" -> {
                beritaModeListAdapter = BeritaModeListAdapter {
                    val intent = Intent(this, DetailActivity::class.java)
                    intent.putExtra("data_berita", it)
                    startActivity(intent)
                }
                mainActivityBinding.rvBerita.layoutManager = LinearLayoutManager(this)
                mainActivityBinding.rvBerita.adapter = beritaModeListAdapter
                beritaModeListAdapter.setListBerita(listBerita)
                supportActionBar?.title = "Home (Mode List)"
            }
            "mode_grid" -> {
                beritaModeGridAdapter = BeritaModeGridAdapter {
                    val intent = Intent(this, DetailActivity::class.java)
                    intent.putExtra("data_berita", it)
                    startActivity(intent)
                }
                mainActivityBinding.rvBerita.layoutManager = GridLayoutManager(this, 2)
                mainActivityBinding.rvBerita.adapter = beritaModeGridAdapter
                beritaModeGridAdapter.setListBerita(listBerita)
                supportActionBar?.title = "Home (Mode Grid)"
            }
        }
    }
}