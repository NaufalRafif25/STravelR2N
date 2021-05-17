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
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import org.d3if4062.stravel.R
import org.d3if4062.stravel.databinding.FragmentLoginBinding

class LoginFragment : Fragment(),View.OnClickListener {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btn_login : Button
    private lateinit var register :TextView
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        email = view.findViewById<EditText>(R.id.editTextEmail)
        password = view.findViewById<EditText>(R.id.editTextPassword)

        view.findViewById<TextView>(R.id.tv_register).setOnClickListener {
            NavHostFragment.findNavController(this@LoginFragment)
                .navigate(R.id.action_loginFragment_to_registerFragment)


            view.findViewById<Button>(R.id.buttonLogin).setOnClickListener(this)

        }
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.buttonLogin){
            val inputemail = email.text.toString().trim()

            val inputpassword = email.text.toString().trim()

            var isEmptyFields = false

            when{
                inputemail.isEmpty() -> {
                    isEmptyFields = true
                    email.error = "Fields ini tidak boleh kosong"
                }
                inputpassword.isEmpty() -> {
                    isEmptyFields = true
                    password.error = "Fields ini tidak boleh kosong"
                }

            }

            if(!isEmptyFields){

                NavHostFragment.findNavController(this@LoginFragment)
                    .navigate(R.id.action_loginFragment_to_homeUtamaFragment)
            }


        }
    }
}
