package com.materialdesign.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.materialdesign.loginui.databinding.FragmentSignUpSuccessBinding

class SignUpSuccessFragment : Fragment() {
    private var _binding: FragmentSignUpSuccessBinding? = null
    private val binding get() = _binding!!

    private var email: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            email = it.getString(ARG_EMAIL)
            password = it.getString(ARG_PASSWORD)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpSuccessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.emailValue.text = email
        binding.passwordValue.text = password


        binding.backButton.setOnClickListener {

            (requireActivity() as MainActivity).returnToMainScreen()
        }
    }



    companion object {
        private const val ARG_EMAIL = "email"
        private const val ARG_PASSWORD = "password"

        fun newInstance(email: String, password: String) =
            SignUpSuccessFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_EMAIL, email)
                    putString(ARG_PASSWORD, password)
                }
            }
    }
}