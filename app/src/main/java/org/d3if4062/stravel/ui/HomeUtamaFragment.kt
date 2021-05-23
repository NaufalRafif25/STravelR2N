package org.d3if4062.stravel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import org.d3if4062.stravel.R
import org.d3if4062.stravel.data.TiketPesawat
import org.d3if4062.stravel.databinding.FragmentHomeUtamaBinding

class HomeUtamaFragment : Fragment() {
    private lateinit var binding: FragmentHomeUtamaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("HomeUtamaFragment", "bagian home utama fragment error")
        binding = FragmentHomeUtamaBinding.inflate(layoutInflater, container, false)
        binding.btnPesawat.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_homeUtamaFragment_to_homeTiketPesawatFragment) }
        with(binding.list1) {
            addItemDecoration(androidx.recyclerview.widget.DividerItemDecoration(context, androidx.recyclerview.widget.RecyclerView.VERTICAL))
            adapter = org.d3if4062.stravel.PesawatAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }
    private fun getData(): List<TiketPesawat> {
        return listOf(
                TiketPesawat("Garuda Indonesia", "Jakarta","1.500.000", R.drawable.garuda),
                TiketPesawat("Lion Terbang", "Bali","1.200.00", R.drawable.lion),
                TiketPesawat("Air Asia", "Singapore","800.00", R.drawable.airasia),
                TiketPesawat("Batik Air", "Lombok","1.000.000", R.drawable.batik)

        )
    }
}