package com.example.ppapb_bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ppapb_bottomnavigation.databinding.FragmentOrderBinding
import com.example.ppapb_bottomnavigation.OrderFragmentDirections

class OrderFragment : Fragment() {
    private lateinit var binding: FragmentOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewTicketCategory = binding.ticketCategories // Pastikan ID-nya sesuai

        textViewTicketCategory.setOnClickListener {
            val action = OrderFragmentDirections.actionOrderFragmentToChooseTicketFragment()
            findNavController().navigate(action)
        }

        val selectedTicketType = arguments?.getString("selectedTicketType")

        selectedTicketType?.let {
            textViewTicketCategory.text = it
        }
    }
}
