package com.android_tuts.hotelbooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android_tuts.hotelbooking.databinding.FragementLoginBinding
import com.android_tuts.hotelbooking.util.Validate
import com.android_tuts.hotelbooking.util.ValidateException
import com.google.android.material.snackbar.Snackbar

class FragementLogin : Fragment() {
    private lateinit var binding: FragementLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragementLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            try {
                Validate(binding.etEmail).isEmptyWithTrim("Enter Email")
                    .checkEmail("Enter valid Email")
                Validate(binding.etPassword).isEmpty("Enter Password")
            } catch (ex: ValidateException) {
                Snackbar.make(view, ex.localizedMessage.toString(), Snackbar.LENGTH_LONG).show()
            }
        }
        binding.swipeRight.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

    }
}