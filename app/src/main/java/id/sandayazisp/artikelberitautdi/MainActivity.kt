package id.sandayazisp.artikelberitautdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import id.sandayazisp.artikelberitautdi.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.berita)
        textView.text = Datasource().loadArtikels().size.toString()
    }
}