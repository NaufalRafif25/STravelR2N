package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.databinding.FragmentHomeHotelBinding

class HomeHotelFragment: Fragment() {
    private lateinit var binding: FragmentHomeHotelBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeHotelBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}