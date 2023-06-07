package com.example.finalproject.view.ui.hasilpencarian

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentNonLoginHasilPencarianBinding
import com.example.finalproject.model.ItemHasilPencarian
import com.example.finalproject.model.ItemJadwal
import com.example.finalproject.view.ui.adapter.JadwalAdapter
import com.example.finalproject.view.ui.adapter.PencarianAdapter

class NonLoginHasilPencarianFragment : Fragment() {

    lateinit var binding : FragmentNonLoginHasilPencarianBinding
    lateinit var jadwalAdapter: JadwalAdapter
    lateinit var pencarianAdapter: PencarianAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNonLoginHasilPencarianBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
        binding.rvJadwal.layoutManager = layoutManager
        val itemJadwal = listOf(
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023"),
            ItemJadwal("Senin","15/01/2023")

        )
        jadwalAdapter = JadwalAdapter(itemJadwal)
        binding.rvJadwal.adapter = jadwalAdapter

        val layoutManager2 = LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
        binding.rvHasilPencarian.layoutManager = layoutManager2
        val itemHasilPencarian = listOf(
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy"),
            ItemHasilPencarian("07:00","JKT","4h 0m","11:00","MLB","IDR 4.950.000","Jet Air - Economy")
        )
        pencarianAdapter = PencarianAdapter(itemHasilPencarian)
        binding.rvHasilPencarian.adapter = pencarianAdapter

    }
}