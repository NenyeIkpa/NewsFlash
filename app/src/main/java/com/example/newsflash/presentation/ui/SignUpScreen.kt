package com.example.newsflash.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newsflash.R
import com.example.newsflash.databinding.FragmentSignUpScreenBinding


class SignUpScreen : Fragment() {

    private var _binding : FragmentSignUpScreenBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signupScreenLoginTv.setOnClickListener {
            findNavController().navigate(R.id.action_signUpScreen_to_loginScreen)
        }
    }
}