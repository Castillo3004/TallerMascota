package com.example.tallermascota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro_mascota.*

class RegistroMascota : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_mascota)

        setup()

        btn_Regresar.setOnClickListener {
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }

    private fun setup(){
        btn_Guardar.setOnClickListener(){
            db.collection("mascotas").document().set(
                hashMapOf("nombreMascota" to tv_nombre.text.toString(),
                    "Edad" to tv_edad.text.toString(), "Raza" to tv_raza.text.toString(), "Color" to tv_color.text.toString())
            )
            Toast.makeText(applicationContext, "Mascota Registrada", Toast.LENGTH_SHORT).show()
        }
    }


}