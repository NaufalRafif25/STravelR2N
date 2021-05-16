package org.d3if4062.stravel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.databinding.FragmentHomeUtamaBinding

class HomeUtamaFragment : Fragment() {
    private lateinit var binding: FragmentHomeUtamaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("HomeUtamaFragment", "bagian home utama fragment error")
        binding = FragmentHomeUtamaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}