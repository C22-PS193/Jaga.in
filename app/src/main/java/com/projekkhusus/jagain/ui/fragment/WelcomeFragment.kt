package com.projekkhusus.jagain.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.projekkhusus.jagain.R
import com.projekkhusus.jagain.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.let {
            with(binding) {
                button3.setOnClickListener(this@WelcomeFragment)
                button4.setOnClickListener(this@WelcomeFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.button3 -> findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
            R.id.button4 -> findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
        }
    }
}