package com.example.roommvvm.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.roommvvm.model.LoginTableModel
import com.example.roommvvm.room.LoginDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class LoginRepository {

    companion object {

    var loginDatabase: LoginDatabase? = null

    var loginTableModel: LiveData<LoginTableModel>? = null

    fun initializeDB(context: Context) : LoginDatabase {
        return LoginDatabase.getDatabaseClient(context)
    }

    fun insertData(context: Context, username: String, password: String) {

        loginDatabase = initializeDB(context)

        CoroutineScope(IO).launch {
            val loginDetails = LoginTableModel(username, password)
            loginDatabase!!.loginDao().InsertData(loginDetails)
        }

    }

    fun getLoginDetails(context: Context, username: String) : LiveData<LoginTableModel>? {

        loginDatabase = initializeDB(context)

        loginTableModel = loginDatabase!!.loginDao().getLoginDetails(username)

        return loginTableModel
    }

}

}
