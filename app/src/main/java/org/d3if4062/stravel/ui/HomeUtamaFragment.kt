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
        binding.btnHotel.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_homeUtamaFragment_to_homeHotelFragment) }
        return binding.root
    }

}