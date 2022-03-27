package com.example.actividadno02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLongitud = findViewById<Button>(R.id.btnLongitud)
        val btncaracter = findViewById<Button>(R.id.btncaracter)
        val btnpar = findViewById<Button>(R.id.btnpar)
        val btnvocal = findViewById<Button>(R.id.btnvocal)
        val btnrepetidas = findViewById<Button>(R.id.btnrepetidas)
        val btnCreditos = findViewById<Button>(R.id.btnCreditos)

        btnLongitud.setOnClickListener {

            Toast.makeText(this, "Longitud", Toast.LENGTH_SHORT).show()
            val Longitud: Intent = Intent(this, FuncionesCadenasActivity2::class.java)
            startActivity(Longitud)
        }

        btncaracter.setOnClickListener {
            Toast.makeText(this, "Primer y último carácter", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, CaracterActivity2::class.java)
            startActivity(intent)
        }
        btnpar.setOnClickListener {
            Toast.makeText(this, "Caracteres en posición par", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, ParActivity2::class.java)
            startActivity(intent)
        }
        btnvocal.setOnClickListener {
            Toast.makeText(this, "Cantidad de vocales", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, VocalesActivity2::class.java)
            startActivity(intent)
        }
        btnrepetidas.setOnClickListener {
            Toast.makeText(this, "Palabras repetidas", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, RepetidasActivity2::class.java)
            startActivity(intent)
        }
        btnCreditos.setOnClickListener {
            Toast.makeText(this, "Créditos", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, CreditosActivity2::class.java)
            startActivity(intent)
        }
    }
}