package org.d3if4062.stravel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.data.PaketWisata
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.ListItemPaketWisataBinding
import org.d3if4062.stravel.databinding.ListItemTiketPesawatBinding

class PaketWisataAdapter(private val data: List<PaketWisata>) :
    RecyclerView.Adapter<PaketWisataAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ListItemPaketWisataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(paketWisata: PaketWisata) = with(binding) {
            tempat.text = paketWisata.tempat
            maskapai.text = paketWisata.maskapai
            hotel.text = paketWisata.hotel
            harga.text = paketWisata.harga
            imageView.setImageResource(paketWisata.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemPaketWisataBinding.inflate(inflater, parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}