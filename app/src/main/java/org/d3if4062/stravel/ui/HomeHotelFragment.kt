package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4062.stravel.HotelAdapter
import org.d3if4062.stravel.PesawatAdapter
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.TiketHotel
import org.d3if4062.stravel.databinding.FragmentHomeHotelBinding

class HomeHotelFragment: Fragment() {
    private lateinit var binding: FragmentHomeHotelBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeHotelBinding.inflate(layoutInflater, container, false)
        with(binding.list2) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = HotelAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }
    private fun getData(): List<TiketHotel> {
        return listOf(
                TiketHotel("Hotel Lombok", "Lombok","1.200.000", R.drawable.hotel1),
                TiketHotel("Kempinski", "Jakarta","1.500.000", R.drawable.hotel2),
                TiketHotel("JW Marriot", "Jakarta","1.000.000", R.drawable.hotel3),
                TiketHotel("Hotel Bali", "Bali","8.000.000", R.drawable.hotel4)

        )
    }
}