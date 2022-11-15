package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var num1 = 0
    private var num2 = 0
    private var operacion: Char? = null
    private var resultado = 0

    private var calculadora = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display: TextView = findViewById(R.id.tvDisplay)
        val fraccion: Button = findViewById(R.id.btnFraccion)
        val potencia: Button = findViewById(R.id.btnExponente)
        val raiz: Button = findViewById(R.id.btnRaiz)
        val division: Button = findViewById(R.id.btnDivision)
        val siete: Button = findViewById(R.id.btnSiete)
        val ocho: Button = findViewById(R.id.btnOcho)
        val nueve: Button = findViewById(R.id.btnNueve)
        val multiplicacion: Button = findViewById(R.id.btnMultiplicacion)
        val cuatro: Button = findViewById(R.id.btnCuatro)
        val cinco: Button = findViewById(R.id.btnCinco)
        val seis: Button = findViewById(R.id.btnSeis)
        val resta: Button = findViewById(R.id.btnResta)
        val uno: Button = findViewById(R.id.btnUno)
        val dos: Button = findViewById(R.id.btnDos)
        val tres: Button = findViewById(R.id.btnTres)
        val suma: Button = findViewById(R.id.btnSuma)
        val clear: Button = findViewById(R.id.btnClear)
        val cero: Button = findViewById(R.id.btnCero)
        val punto: Button = findViewById(R.id.btnPunto)
        val igual: Button = findViewById(R.id.btnIgual)

        fraccion.setOnClickListener { showMessage() }
        potencia.setOnClickListener { showMessage() }
        raiz.setOnClickListener { showMessage() }
        punto.setOnClickListener { showMessage() }
        punto.setOnClickListener { showMessage() }

        division.setOnClickListener {
            operacion = '/'
        }
        multiplicacion.setOnClickListener {
            operacion = '*'
        }
        resta.setOnClickListener {
            operacion = '-'
        }
        suma.setOnClickListener {
            operacion = '+'
        }

        cero.setOnClickListener {
            if (operacion == null) num1 = 0 else num2 = 0
            display.text = "0"
        }

        uno.setOnClickListener {
            if (operacion == null) num1 = 1 else num2 = 1
            display.text = "1"
        }

        dos.setOnClickListener {
            if (operacion == null) num1 = 2 else num2 = 2
            display.text = "2"
        }

        tres.setOnClickListener {
            if (operacion == null) num1 = 3 else num2 = 3
            display.text = "3"
        }

        cuatro.setOnClickListener {
            if (operacion == null) num1 = 4 else num2 = 4
            display.text = "4"
        }

        cinco.setOnClickListener {
            if (operacion == null) num1 = 5 else num2 = 5
            display.text = "5"
        }

        seis.setOnClickListener {
            if (operacion == null) num1 = 6 else num2 = 6
            display.text = "6"
        }

        siete.setOnClickListener {
            if (operacion == null) num1 = 7 else num2 = 7
            display.text = "7"
        }

        ocho.setOnClickListener {
            if (operacion == null) num1 = 8 else num2 = 8
            display.text = "8"
        }

        nueve.setOnClickListener {
            if (operacion == null) num1 = 9 else num2 = 9
            display.text = "9"
        }

        igual.setOnClickListener {
            resultado = when (operacion){
                '+' -> calculadora.suma(num1, num2)
                '-' -> calculadora.resta(num1, num2)
                '*' -> calculadora.multiplicacion(num1, num2)
                '/' -> calculadora.division(num1, num2)
                else -> 0
            }
            display.text = resultado.toString()
            operacion = null
            num1 = resultado
            num2 = 0
        }

        clear.setOnClickListener {
            display.text = "0"
            operacion = null
            num1 = 0
            num2 = 0
        }

    }

    fun showMessage() {
        Toast.makeText(this, "It will be available soon c:", Toast.LENGTH_SHORT).show()
    }
}