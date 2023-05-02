package com.example.whatsapploginsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.whatsapp_login.WhatsappLogin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<Button>(R.id.button)
        var number = findViewById<EditText>(R.id.editTextTextPersonName)

        login.setOnClickListener {
            var status =  WhatsappLogin.login(this,number.text.toString().trim());
            if(status){
                Toast.makeText(this,"Please check your whatsapp otp send..",Toast.LENGTH_LONG).show()
            }
        }

    }
}