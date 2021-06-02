package org.d3if4062.stravel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.ListItemTiketPesawatBinding

class TiketPesawatAdapter(private val data: List<TiketPesawat>) :
    RecyclerView.Adapter<TiketPesawatAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ListItemTiketPesawatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tiketPesawat: TiketPesawat) = with(binding) {
            namaTiketPesawat.text = tiketPesawat.maskapai
            hargaTiketPesawat.text = tiketPesawat.hargaTiketPesawat
            tujuan.text = tiketPesawat.tujuan
            imageView.setImageResource(tiketPesawat.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemTiketPesawatBinding.inflate(inflater, parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}