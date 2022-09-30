package id.sandayazisp.artikelberitautdi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// membuat class data Artikel yang berisi parameter bilangan bulat stringResourceId dan imageResourceId
// kita menambahkan anotasi @StringRes ke properti ID resource string dan anotasi @DrawableRes ke properti ID resource drawable.
data class Artikel(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)