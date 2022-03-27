package com.example.actividadno02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FuncionesCadenasActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funciones_cadenas2)

            val edValor1 = findViewById<EditText>(R.id.edValor1)
            val edValor2 = findViewById<EditText>(R.id.edValor2)
            val edValor3 = findViewById<EditText>(R.id.edValor3)
            val btnLongitud = findViewById<Button>(R.id.btnLongitud)
            val tvResultado = findViewById<TextView>(R.id.tvResultado)
            val tvResultado2 = findViewById<TextView>(R.id.tvResultado2)
            val tvResultado3 = findViewById<TextView>(R.id.tvResultado3)

        btnLongitud.setOnClickListener {
            Toast.makeText(this,"La longitud es: ${edValor1.length()}" , Toast.LENGTH_LONG).show()
            tvResultado.text = "la Longitud es: ${edValor1.length()}"

            Toast.makeText(this,"La longitud es: ${edValor2.length()}" , Toast.LENGTH_LONG).show()
            tvResultado2.text = "la Longitud es: ${edValor2.length()}"

            Toast.makeText(this,"La longitud es: ${edValor3.length()}" , Toast.LENGTH_LONG).show()
            tvResultado3.text = "la Longitud es: ${edValor3.length()}"

        }

    }
}