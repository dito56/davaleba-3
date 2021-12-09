package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextEmail:EditText
    private lateinit var editTextPassword:EditText
    private lateinit var buttonLogin: Button
    private lateinit var buttonRegister: Button
    private lateinit var buttonResetPassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()

        registeListeners()
    }

    private fun init(){
        editTextEmail=findViewById(R.id.editTextEmail)
        editTextPassword=findViewById(R.id.editTextPassword)
        buttonLogin=findViewById(R.id.buttonLogin)
        buttonRegister=findViewById(R.id.buttonRegister)
        buttonResetPassword=findViewById(R.id.buttonResetPassword)


    }

    private fun registeListeners(){
        buttonRegister.setOnClickListener {
            startActivity(this, RegisterActivity :: class.java )

        }
        buttonResetPassword.setOnClickListener {
            startActivity(this, ResetPasswordActivity :: class.java )
        }
        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password= editTextPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "empty" , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }

    }
}