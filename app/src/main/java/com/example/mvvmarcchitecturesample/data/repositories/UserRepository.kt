package com.example.mvvmarcchitecturesample.data.repositories


import com.example.mvvmarcchitecturesample.data.network.MyApi
import com.example.mvvmarcchitecturesample.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {

    suspend fun userLogin(email: String, password: String) : Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }
}