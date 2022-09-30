package id.sandayazisp.artikelberitautdi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.sandayazisp.artikelberitautdi.model.Artikel
import id.sandayazisp.artikelberitautdi.R

// membuat class ItemAdapter yang berfungsi sebagai pola desain yang menyesuaikan data menjadi sesuatu yang dapat digunakan oleh RecyclerView.
// didalam class ItemAdapter kita menambahkan parameter val yang disebut dataset jenis List<Affirmation> dan val yang disebut context dari jenis Context. Karena dataset hanya akan digunakan dalam class ini, maka kita jadikan private.
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Artikel>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

//    pada class ItemViewHolder berfungsi untuk menyimpan referensi ke setiap tampilan dalam tata letak item daftar (dengan nama "holder tampilan"). Hal tersebut mempermudah untuk memperbarui tampilan item daftar dengan data baru.
//    didalam class ItemViewHolder terdapat properti textView dan imageView dengan menampilkan data dari id yang sudah kita tentukan di file list_item.xml.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

// metode onCreateViewHolder berfungsi untuk membuat holder tampilan baru untuk RecyclerView.
//    pada metode ini memiliki 2 parameter yaitu parent dan viewType.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent,false)

        return ItemViewHolder(adapterLayout)
    }

//    metode onBindViewHolder berfungsi untuk mengganti isi tampilan item daftar.
//    pada metode ini memiliki 2 parameter yaitu holder dan position.
//    kemudian terdapat holder.textView dan holder.imageView yang digunakan untuk mengambil data string sesuasi dengna ID nya dan gambar sesuasi dengan ID nya
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

//    pada fungsi getItemCount berfungsi untuk menampilkan ukuran set data.
    override fun getItemCount() = dataset.size
}