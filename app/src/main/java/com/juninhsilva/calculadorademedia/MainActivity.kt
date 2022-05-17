package com.juninhsilva.calculadorademedia

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular:Button = btCalcular;
        val resultado:TextView = tvResultado;

        btCalcular.setOnClickListener(){
            val nota1 = Integer.parseInt(editTextNota1.text.toString());
            val nota2 = Integer.parseInt(editTextNota2.text.toString());
            val faltas = Integer.parseInt(editTextFaltas.text.toString());
            val media = (nota1+nota2)/2;

            if (media >= 6 && faltas <= 20){
                tvResultado.setText("Aprovado\nnNota Final: " + media + "\nFaltas: " + faltas);
                tvResultado.setTextColor(Color.GREEN);
            }else{
                tvResultado.setText("Reprovado\nNota Final: " + media + "\nFaltas: " + faltas);
                tvResultado.setTextColor(Color.RED);
            }
        }
    }
}