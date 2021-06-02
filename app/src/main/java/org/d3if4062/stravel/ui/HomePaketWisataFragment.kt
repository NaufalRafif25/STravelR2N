package org.d3if4062.stravel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.PaketWisata
import org.d3if4062.stravel.data.TiketHotel
import org.d3if4062.stravel.databinding.FragmentHomePaketWisataBinding
import org.d3if4062.stravel.databinding.FragmentHomeTiketPesawatBinding

class HomePaketWisataFragment: Fragment() {
    private lateinit var binding: FragmentHomePaketWisataBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("HomePaketWisataFragment", "Jumlah data: " + getData().size)
        binding = FragmentHomePaketWisataBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(
                androidx.recyclerview.widget.DividerItemDecoration(
                    context,
                    androidx.recyclerview.widget.RecyclerView.VERTICAL
                )
            )
            adapter = org.d3if4062.stravel.PaketWisataAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<PaketWisata> {
        return listOf(
            PaketWisata("Lombok", "Air Asia", "Grand Lombok", "Rp10,000,000 / 2 hari 3 malam", R.drawable.lombok),
            PaketWisata("Lombok", "Garuda", "Grand Lombok", "Rp13,000,000 / 3 hari 4 malam", R.drawable.lombok),
            PaketWisata("Lombok", "Air Asia", "Grand Lombok", "Rp16,000,000 / 4 hari 5 malam", R.drawable.lombok),
            PaketWisata("Lombok", "Citilink", "Grand Lombok", "Rp21,000,000 / 5 hari 6 malam", R.drawable.lombok)
        )
    }

}