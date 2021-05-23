package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.TiketHotel
import org.d3if4062.stravel.databinding.FragmentHomeHotelBinding

class HomeHotelFragment: Fragment() {
    private lateinit var binding: FragmentHomeHotelBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeHotelBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    private fun getData(): List<TiketHotel> {
        return listOf(
                TiketHotel("Grand Asrilia", "Bandung", "Rp1,000,000/kamar/malam", R.drawable.hotel1),
                TiketHotel("Grand Asrilia", "Bandung", "Rp1,500,000/2 kamar/malam", R.drawable.hotel1),
                TiketHotel("Rekano", "Bali", "Rp2,000,000/kamar/malam", R.drawable.hotel1),
                TiketHotel("Rekano", "Bali", "Rp2,500,000/kamar/2 malam", R.drawable.hotel1),
                TiketHotel("JBC", "Lombok", "Rp3,000,000/kamar/malam", R.drawable.hotel1)
        )
    }
}