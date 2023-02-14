package com.example.smokeyarntrial
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import com.example.smokeyarntrial.databinding.ActivityMainBinding


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase



class AdminLogin : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//private lateinit var binding: ActivityAdminLogin
private lateinit var user:FirebaseAuth




    private  lateinit var firebaseAuth: FirebaseAuth
    lateinit var etEmail: EditText
    lateinit var etConfPass: EditText
    private lateinit var etPass: EditText



    val adminLogin = findViewById<ImageView>(R.id.login)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding= ActivityMainBinding.inflate(layoutInflater)
        user=FirebaseAuth.getInstance()


        etEmail = findViewById(R.id.edt_email)
        etConfPass = findViewById(R.id.edt_password)
        etPass = findViewById(R.id.edt_password)





       binding.imageButton.setOnClickListener {

            registerUser()



        }
        }
        private fun  registerUser(){

         //   val email =binding.edt_email.text.toString()

}

        }







