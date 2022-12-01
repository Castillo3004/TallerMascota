package com.example.tallermascota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.core.view.iterator
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_lista_mascotas.*
import kotlinx.android.synthetic.main.activity_registro_mascota.*

class ListaMascotas : AppCompatActivity() {
    private val db2 = FirebaseFirestore.getInstance()
    private var listadoPerros:ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_mascotas)



        btn_Regresar2.setOnClickListener{
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }

        for (mascota in listadoPerros){
            db2.collection("mascotas").document().get().addOnSuccessListener {
                et_nombre.setText(it.get("nombreMascota")as String?)
            }
        }


    }
}