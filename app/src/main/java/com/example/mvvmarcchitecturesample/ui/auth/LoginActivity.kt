package com.example.mvvmarcchitecturesample.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarcchitecturesample.R
import com.example.mvvmarcchitecturesample.data.db.entities.User
import com.example.mvvmarcchitecturesample.databinding.ActivityLoginBinding
import com.example.mvvmarcchitecturesample.util.hide
import com.example.mvvmarcchitecturesample.util.show
import com.example.mvvmarcchitecturesample.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , AuthListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        toast("${user.name} is Logged In")
        progress_bar.hide()
    }

    override fun onFailure(message: String) {
        toast(message)
        progress_bar.hide()
    }
}