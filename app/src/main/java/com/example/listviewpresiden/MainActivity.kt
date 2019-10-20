package com.example.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Presiden>()

        list.add(Presiden("Ir Soekarno", "Presiden Ke-1 Indonesia.", R.drawable.soekarno))
        list.add(Presiden("Soeharto", "Presiden Ke-2 Indonesia.", R.drawable.seoharto))
        list.add(Presiden("BJ Habibie", "Presiden Ke-3 Indonesia.", R.drawable.habibie))
        list.add(Presiden("Abdurrahman Wahid", "Presiden Ke-4 Indonesia.", R.drawable.gusdur))
        list.add(Presiden("Megawati Soekarnoputri", "Presiden Ke-5 Indonesia", R.drawable.megawati))
        list.add(Presiden("Susilo Bambang Yudhoyono", "Presiden Ke-6 Indonesia", R.drawable.susilo))
        list.add(Presiden("Joko Widodo", "Presiden Ke-7 Indonesia", R.drawable.jokowi))

        listview.adapter = ListPresidenAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Ir.Soekarno - Lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun. Beliau adalah Presiden Indonesia pertama yang menjabat pada periode 1945–1966.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Soeharto - Lahir di Dusun Kemusuk, Desa Argomulyo, Kecamatan Sedayu, Bantul, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun. Beliau adalah Presiden ke-dua Indonesia yang menjabat dari tahun 1967 sampai 1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Prof. Dr.-Ing. H. Bacharuddin Jusuf Habibie - Lahir di Parepare, Sulawesi Selatan, 25 Juni 1936 - meninggal pada 11 September 2019 pada umur 83 tahun) adalah Presiden Republik Indonesia yang ketiga. Beliau menggantikan Soeharto yang mengundurkan diri pada tanggal 21 Mei 1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Dr.(H.C.) K. H. Abdurrahman Wahid alias Gus Dur - Lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun. Beliau adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001.", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Dr.(H.C.) Hj. Dyah Permata megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai Megawati Soekarnoputri - Lahir di Yogyakarta, 23 Januari 1947. Beliau adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 - 20 Oktober 2004.", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Jenderal TNI (Purn.) Prof. Dr. H. Susilo Bambang Yudhoyono - Lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949. Beliau adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Ir. H. Joko Widodo atau yang lebih akrab disapa Jokowi - Lahir di Surakarta, Jawa Tengah, 21 Juni 1961. Beliau adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014 hingga saat ini.", Toast.LENGTH_LONG).show()
            }
        }
    }
}