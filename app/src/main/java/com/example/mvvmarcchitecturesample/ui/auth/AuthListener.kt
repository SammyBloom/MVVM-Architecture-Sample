package com.example.mvvmarcchitecturesample.ui.auth

import androidx.lifecycle.LiveData
import com.example.mvvmarcchitecturesample.data.db.entities.User

interface AuthListener {

    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)

}