package id.sandayazisp.artikelberitautdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.sandayazisp.artikelberitautdi.adapter.ItemAdapter
import id.sandayazisp.artikelberitautdi.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initial data
        val myDataset = Datasource().loadArtikels()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // code dibawah digunakan  untuk meningkatkan kinerja jika ada perubahan
        // dalam hal ini tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}