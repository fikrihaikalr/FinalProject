package com.example.finalproject.view.ui.hasilpencarian

import android.provider.ContactsContract.Data
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finalproject.model.flight.DataFlight
import com.example.finalproject.model.flight.FlightResponse
import com.example.finalproject.network.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class NonLoginHasilPencarianViewModel @Inject constructor(private val api: ApiService) : ViewModel() {
    var liveDataFlight : MutableLiveData<List<DataFlight?>?> = MutableLiveData()

    fun fetchTicket(){
        api.getAllFlight().enqueue(object : Callback<FlightResponse>{
            override fun onResponse(
                call: Call<FlightResponse>,
                response: Response<FlightResponse>
            ) {
                if (response.isSuccessful) {
                    val ticketList = response.body()?.data
                    liveDataFlight.value = ticketList
                } else {
                    Log.e("Flight Search VM", "Error View Model")
                }
            }

            override fun onFailure(call: Call<FlightResponse>, t: Throwable) {
                Log.e("Flight Search VM", "Error View Model")
            }

        })
    }
}