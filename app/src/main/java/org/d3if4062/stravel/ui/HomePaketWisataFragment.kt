package org.d3if4062.stravel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.databinding.FragmentHomePaketWisataBinding
import org.d3if4062.stravel.databinding.FragmentHomeTiketPesawatBinding

class HomePaketWisataFragment: Fragment() {
    private lateinit var binding: FragmentHomePaketWisataBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomePaketWisataBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}