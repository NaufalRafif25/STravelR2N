package org.d3if4062.stravel.ui

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import org.d3if4062.stravel.R
import org.d3if4062.stravel.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("LoginFragment", "bagian login fragment error")
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        binding.buttonLogin.setOnClickListener {
            if (login()) {
                view?.findNavController()?.navigate(R.id.action_loginFragment_to_homeUtamaFragment)
            }
        }
//        binding.buttonLogin.setOnClickListener { view: View-> view.findNavController().navigate(
//                    R.id.action_loginFragment_to_homeUtamaFragment
//        ) }
        return binding.root
    }

    private fun login(): Boolean{
        val email = binding.editTextEmail.text.toString()
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(context, R.string.email_invalid, Toast.LENGTH_LONG).show()
            return false
        }

        val password = binding.editTextPassword.text.toString()
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, R.string.password_invalid, Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }
}