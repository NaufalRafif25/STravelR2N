package org.d3if4062.stravel.ui

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import org.d3if4062.stravel.R
import org.d3if4062.stravel.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("RegisterFragment", "bagian register fragment error")
        binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        binding.buttonRegister.setOnClickListener { register() }
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<TextView>(R.id.tv_login).setOnClickListener {
            NavHostFragment.findNavController(this@RegisterFragment)
                .navigate(R.id.action_registerFragment_to_loginFragment)




        }
    }

    private fun register() {
        val name = binding.editTextName.text.toString()
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(context, R.string.name_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val email = binding.editTextEmail.text.toString()
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(context, R.string.email_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val password = binding.editTextPassword.text.toString()
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, R.string.email_invalid, Toast.LENGTH_LONG).show()
            return
        }
    }
}