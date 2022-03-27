package com.example.actividadno02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CaracterActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caracter2)

        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val btnIf = findViewById<Button>(R.id.btnIf)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val tvResultado2 = findViewById<TextView>(R.id.tvResultado2)

        btnIf.setOnClickListener {
            Toast.makeText(this,"Primer caracter es: ${edValor1.text.toString().substring(0,1)}" , Toast.LENGTH_LONG).show()
            tvResultado.text = "Primer caracter es: ${edValor1.text.toString().substring(0,1)}"

            Toast.makeText(this,"El ultimo caracter es: ${edValor1.text.toString().substring(edValor1.text.toString().length-1,edValor1.text.toString().length)}" , Toast.LENGTH_LONG).show()
            tvResultado2.text = "El ultimo caracter es: ${edValor1.text.toString().substring(edValor1.text.toString().length-1,edValor1.text.toString().length)}"
        }

    }
}