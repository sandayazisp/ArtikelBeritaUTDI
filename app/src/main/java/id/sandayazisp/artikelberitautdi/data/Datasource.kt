package id.sandayazisp.artikelberitautdi.data

import id.sandayazisp.artikelberitautdi.R
import id.sandayazisp.artikelberitautdi.model.Artikel

class Datasource {
    fun loadArtikels(): List<Artikel> {
        return listOf<Artikel>(
            Artikel(R.string.artikel1),
            Artikel(R.string.artikel2),
            Artikel(R.string.artikel3),
            Artikel(R.string.artikel4),
            Artikel(R.string.artikel5),
            Artikel(R.string.artikel6),
            Artikel(R.string.artikel7),
            Artikel(R.string.artikel8),
            Artikel(R.string.artikel9),
            Artikel(R.string.artikel10)
        )
    }
}