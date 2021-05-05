package org.d3if4062.stravel.ui

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.d3if4062.stravel.R
import org.d3if4062.stravel.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("LoginFragment", "bagian error")
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        binding.buttonLogin.setOnClickListener { login() }
        return binding.root
    }

    private fun login() {
        val email = binding.editTextEmail.text.toString()
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(context, R.string.email_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val password = binding.editTextPassword.text.toString()
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, R.string.password_invalid, Toast.LENGTH_LONG).show()
            return
        }
    }
}