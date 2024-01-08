package com.android_tuts.hotelbooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android_tuts.hotelbooking.databinding.FragementSignupBinding

class FragmentSignup : Fragment(){
    private lateinit var binding: FragementSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragementSignupBinding.inflate(inflater , container , false)
        return binding.root
    }
}