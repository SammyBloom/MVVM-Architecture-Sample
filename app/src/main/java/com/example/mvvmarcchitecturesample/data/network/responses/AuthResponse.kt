package com.example.mvvmarcchitecturesample.data.network.responses

import com.example.mvvmarcchitecturesample.data.db.entities.User

data class AuthResponse(
     val  isSuccessful : Boolean?,
     val message: String?,
     val user: User?
        )