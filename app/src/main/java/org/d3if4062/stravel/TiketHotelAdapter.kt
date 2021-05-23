package org.d3if4062.stravel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.data.TiketHotel
import org.d3if4062.stravel.databinding.ListItemTiketHotelBinding

class TiketHotelAdapter(private val data: List<TiketHotel>) :
        RecyclerView.Adapter<TiketHotelAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ListItemTiketHotelBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(tiketHotel: TiketHotel) = with(binding) {
                namaHotel.text = tiketHotel.namaHotel
                lokasiHotel.text = tiketHotel.lokasiHotel
                hargaHotel.text = tiketHotel.hargaHotel
                imageView.setImageResource(tiketHotel.imageResId)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemTiketHotelBinding.inflate(inflater, parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}