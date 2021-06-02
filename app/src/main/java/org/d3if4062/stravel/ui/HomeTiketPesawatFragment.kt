package org.d3if4062.stravel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.FragmentHomeTiketPesawatBinding

class HomeTiketPesawatFragment: Fragment() {
    private lateinit var binding: FragmentHomeTiketPesawatBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("HomeHotelFragment", "Jumlah data: " + getData().size)
        binding = FragmentHomeTiketPesawatBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = org.d3if4062.stravel.TiketPesawatAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }
    private fun getData(): List<TiketPesawat> {
        return listOf(
            TiketPesawat("Garuda Air", "Jakarta - Padang", "Rp1,500,000", R.drawable.garuda),
            TiketPesawat("Lion Air", "Jakarta - Aceh", "Rp2,500,000", R.drawable.lion),
            TiketPesawat("Garuda Air", "Jakarta - Balikpapan", "Rp3,500,000", R.drawable.garuda)
        )
    }
}