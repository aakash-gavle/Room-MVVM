package com.example.roommvvm.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.roommvvm.model.LoginTableModel
import com.example.roommvvm.repository.LoginRepository

class LoginViewModel: ViewModel() {

    var liveDataLogin: LiveData<LoginTableModel>? = null

    fun insertData(context: Context, username: String, password: String) {
        LoginRepository.insertData(context, username, password)
    }

    fun getLoginDetails(context: Context, username: String) : LiveData<LoginTableModel>? {
        liveDataLogin = LoginRepository.getLoginDetails(context, username)
        return liveDataLogin
    }
}