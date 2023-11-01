package com.example.ppapb_bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ppapb_bottomnavigation.databinding.FragmentTicketBinding

class TicketFragment : Fragment() {
    private lateinit var binding: FragmentTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTicketBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnBuy = binding.btnBuy // Gantilah ini dengan referensi ke tombol Anda
        btnBuy.setOnClickListener {
            val action = TicketFragmentDirections.actionTicketFragmentToChooseTicketFragment()
            findNavController().navigate(action)
        }

        btnBuy.setOnClickListener {
            val action = TicketFragmentDirections.actionTicketFragmentToChooseTicketFragment()
            findNavController().navigate(action)
        }
    }
}