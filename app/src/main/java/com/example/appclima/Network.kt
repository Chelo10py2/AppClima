package com.example.appclima

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.support.v7.app.AppCompatActivity

class Network {

    companion object {

        fun hayRed(activity: AppCompatActivity):Boolean{
            val connectivityManager = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            //val networkInfo = connectivityManager.activeNetworkInfo
            //return networkInfo != null && networkInfo.isConnected

            val networkInfo = connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            return networkInfo?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) ?: false
        }
    }
}