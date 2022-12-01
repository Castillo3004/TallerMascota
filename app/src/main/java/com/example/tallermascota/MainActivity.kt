package com.example.tallermascota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Registro.setOnClickListener{
            val saltar: Intent = Intent(this, RegistroMascota::class.java)
            startActivity(saltar)
        }

        btn_Lista.setOnClickListener{
            val saltar2: Intent = Intent(this, ListaMascotas::class.java)
            startActivity(saltar2)
        }


    }


}