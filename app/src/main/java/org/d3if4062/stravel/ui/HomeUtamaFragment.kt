package org.d3if4062.stravel.ui

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import org.d3if4062.stravel.R
import org.d3if4062.stravel.databinding.FragmentHomeUtamaBinding

class HomeUtamaFragment : Fragment() {
    private lateinit var binding: FragmentHomeUtamaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("HomeUtamaFragment", "bagian home utama fragment error")
        binding = FragmentHomeUtamaBinding.inflate(layoutInflater, container, false)
        binding.button.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_homeUtamaFragment_to_homeHotelFragment) }
        binding.button2.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_homeUtamaFragment_to_homePaketWisataFragment) }
        binding.button3.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_homeUtamaFragment_to_homeTiketPesawatFragment) }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.profile) {
            findNavController().navigate(
                    R.id.action_homeUtamaFragment_to_profileUserFragment)
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}