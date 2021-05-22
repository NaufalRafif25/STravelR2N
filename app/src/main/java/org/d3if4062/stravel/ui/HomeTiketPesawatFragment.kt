package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.databinding.FragmentHomeTiketPesawatBinding

class HomeTiketPesawatFragment: Fragment() {
    private lateinit var binding: FragmentHomeTiketPesawatBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeTiketPesawatBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}