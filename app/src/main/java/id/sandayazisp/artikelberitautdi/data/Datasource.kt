package id.sandayazisp.artikelberitautdi.data

import id.sandayazisp.artikelberitautdi.R
import id.sandayazisp.artikelberitautdi.model.Artikel

class Datasource {
    fun loadArtikels(): List<Artikel> {
        return listOf<Artikel>(
            Artikel(R.string.artikel1, R.drawable.img1),
            Artikel(R.string.artikel2, R.drawable.img2),
            Artikel(R.string.artikel3, R.drawable.img3),
            Artikel(R.string.artikel4, R.drawable.img4),
            Artikel(R.string.artikel5, R.drawable.img5),
            Artikel(R.string.artikel6, R.drawable.img6),
            Artikel(R.string.artikel7, R.drawable.img7),
            Artikel(R.string.artikel8, R.drawable.img8),
            Artikel(R.string.artikel9, R.drawable.img9),
            Artikel(R.string.artikel10, R.drawable.img10)
        )
    }
}