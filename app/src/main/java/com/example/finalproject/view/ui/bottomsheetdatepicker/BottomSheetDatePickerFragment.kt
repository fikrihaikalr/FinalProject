package com.example.finalproject.view.ui.bottomsheetdatepicker

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentBottomSheetDatePickerBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetDatePickerFragment : BottomSheetDialogFragment() {

    lateinit var binding : FragmentBottomSheetDatePickerBinding
    companion object{
        val bottomTag : String = "TAG_DATE_PICKER"
    }
    private lateinit var viewModel: BottomSheetDatePickerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetDatePickerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.icClose.setOnClickListener {
            dismiss()
        }
    }



}