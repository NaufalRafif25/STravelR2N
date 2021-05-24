package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.PesawatAdapter
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.FragmentHomeTiketPesawatBinding

class HomeTiketPesawatFragment: Fragment() {
    private lateinit var binding: FragmentHomeTiketPesawatBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeTiketPesawatBinding.inflate(layoutInflater, container, false)
        with(binding.list1) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = PesawatAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }
    private fun getData(): List<TiketPesawat> {
        return listOf(
                TiketPesawat("Garuda Indonesia", "Jakarta","1.500.000", R.drawable.garuda),
                TiketPesawat("Lion Terbang", "Bali","1.200.000", R.drawable.lion),
                TiketPesawat("Air Asia", "Singapore","800.000", R.drawable.airasia),
                TiketPesawat("Batik Air", "Lombok","1.000.000", R.drawable.batik)

        )
    }
}