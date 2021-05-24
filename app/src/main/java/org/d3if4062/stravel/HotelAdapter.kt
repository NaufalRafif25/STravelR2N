package org.d3if4062.stravel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.data.TiketHotel
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.ListHotelBinding


    class HotelAdapter (private val data: List<TiketHotel>) :
            RecyclerView.Adapter<HotelAdapter.ViewHolder>() {

        class ViewHolder(private val binding: ListHotelBinding) :
                RecyclerView.ViewHolder(binding.root) {
            fun bind(tiketHotel: TiketHotel) = with(binding) {
                namaTextView.text = tiketHotel.namaHotel
                lokasi.text = tiketHotel.lokasiHotel
                harga.text = tiketHotel.hargaHotel
                imageView.setImageResource(tiketHotel.imageResId)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListHotelBinding.inflate(inflater, parent, false)
            return ViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return data.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(data[position])
        }
    }
