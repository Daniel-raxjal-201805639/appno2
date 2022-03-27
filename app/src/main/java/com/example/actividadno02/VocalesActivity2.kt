package com.example.actividadno02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class VocalesActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocales2)

        val edValor1 = findViewById<EditText>(R.id.edValor1)
        val btnVocales = findViewById<Button>(R.id.btnVocales)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnVocales.setOnClickListener {
            var  i = 0
                for (vocales in edValor1.text.toString()){
                    if ((vocales in "a"+"A") or (vocales in "e"+"E") or (vocales in "i"+"I") or (vocales in "o"+"O") or (vocales in "u"+"U")){
                        i++
                    }
                }
            Toast.makeText(this,"Total de vocales es de: $i" , Toast.LENGTH_LONG).show()
            tvResultado.text = "Total de vocales es de: $i"
        }
    }
}