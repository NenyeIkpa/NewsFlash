package com.example.newsflash.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newsflash.R
import com.example.newsflash.databinding.FragmentLoginScreenBinding

class LoginScreen : Fragment() {
    private var _binding : FragmentLoginScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginScreenBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginScreenSignupTv.setOnClickListener {
            findNavController().navigate(R.id.action_loginScreen_to_signUpScreen)
        }
    }
}