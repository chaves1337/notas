package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota_1.text.toString())
            val nota2 = Integer.parseInt(nota_2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if ((media >= 6) && (faltas <= 10)){
                resultado.setText("O aluno foi aprovado")
            }
            else{
                resultado.setText("O aluno foi repovado")
            }
        }
    }
}