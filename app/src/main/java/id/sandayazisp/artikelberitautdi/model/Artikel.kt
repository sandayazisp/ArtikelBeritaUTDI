package id.sandayazisp.artikelberitautdi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Artikel(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)