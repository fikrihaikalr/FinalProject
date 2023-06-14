package com.example.finalproject.view.ui.checkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentBiodataPemesanBinding
import com.example.finalproject.databinding.FragmentBiodataPenumpangBinding

class BiodataPenumpangFragment : Fragment() {
    lateinit var binding: FragmentBiodataPenumpangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBiodataPenumpangBinding.inflate(layoutInflater, container, false)

        val titleOptions = arrayOf("Mr.", "Mrs.", "Ms.")
        binding.dropdownTitle.setText(titleOptions[0])

        binding.dropdownTitle.setOnDismissListener {
            showDropdown(titleOptions)
        }

        return binding.root
    }

    private fun showDropdown(titleOptions: Array<String>) {
        binding.dropdownTitle.showDropDown()
    }

}