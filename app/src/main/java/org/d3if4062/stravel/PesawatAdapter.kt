package org.d3if4062.stravel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.ListPesawatBinding


class  PesawatAdapter (private val data: List<TiketPesawat>) :
    RecyclerView.Adapter<PesawatAdapter.ViewHolder>() {

        class ViewHolder(private val binding: ListPesawatBinding) :
                RecyclerView.ViewHolder(binding.root) {
            fun bind(tiketPesawat: TiketPesawat) = with(binding) {
                namaTextView.text = tiketPesawat.maskapai
                hargatiket.text = tiketPesawat.hargaTiketPesawat
                tujuan.text = tiketPesawat.lokasi
                imageView.setImageResource(tiketPesawat.imageResId)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListPesawatBinding.inflate(inflater, parent, false)
            return ViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return data.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(data[position])
        }
    }


