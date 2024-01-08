package com.android_tuts.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {

    private var currentOperand :Double = 0.0
    private var currentOperator:String = ""
    private lateinit var btnZero : Button
    private lateinit var btnOne : Button
    private lateinit var btnTwo : Button
    private lateinit var btnThree : Button
    private lateinit var btnFour : Button
    private lateinit var btnFive : Button
    private lateinit var btnSix : Button
    private lateinit var btnSev : Button
    private lateinit var btnEig : Button
    private lateinit var btnNine : Button
    private lateinit var btnAdd : Button
    private lateinit var btnMin : Button
    private lateinit var btnMulti : Button
    private lateinit var btnDivi : Button
    private lateinit var btnModulo : Button
    private lateinit var btnEqu : Button
    private lateinit var btnAc : Button
    private lateinit var btnC : Button
    private lateinit var btnDo : Button
    private lateinit var tv : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_calculator)

        tv = findViewById(R.id.textView)
        btnZero = findViewById(R.id.btn0)
        btnOne = findViewById(R.id.btn1)
        btnTwo = findViewById(R.id.btn2)
        btnThree = findViewById(R.id.btn3)
        btnFour = findViewById(R.id.btn4)
        btnFive = findViewById(R.id.btn5)
        btnSix = findViewById(R.id.btn6)
        btnSev = findViewById(R.id.btn7)
        btnEig = findViewById(R.id.btn8)
        btnNine = findViewById(R.id.btn9)
        btnAdd = findViewById(R.id.btnPlus)
        btnMin = findViewById(R.id.btnSub)
        btnMulti = findViewById(R.id.btnMul)
        btnDivi = findViewById(R.id.btnDiv)
        btnModulo = findViewById(R.id.btnMod)
        btnEqu = findViewById(R.id.btnEqual)
        btnAc = findViewById(R.id.btnAC)
        btnC = findViewById(R.id.btnClear)
        btnDo = findViewById(R.id.btnDec)





        btnZero.setOnClickListener { numberClick("0")}
        btnOne.setOnClickListener { numberClick("1")}
        btnTwo.setOnClickListener { numberClick("2")}
        btnThree.setOnClickListener { numberClick("3")}
        btnFour.setOnClickListener { numberClick("4")}
        btnFive.setOnClickListener { numberClick("5")}
        btnSix.setOnClickListener { numberClick("6")}
        btnSev.setOnClickListener { numberClick("7")}
        btnEig.setOnClickListener { numberClick("8")}
        btnNine.setOnClickListener{ numberClick("9")}
        btnAdd.setOnClickListener{ operatorClick("+")}
        btnMin.setOnClickListener{ operatorClick("-")}
        btnMulti.setOnClickListener{ operatorClick("X")}
        btnDivi.setOnClickListener{ operatorClick("÷")}
        btnModulo.setOnClickListener{ operatorClick("%")}
        btnEqu.setOnClickListener{ calculateResult() }
        btnAc.setOnClickListener{ numberClick("0")}
        btnDo.setOnClickListener{ operatorClick(".")}
        btnC.setOnClickListener{ clearCalculator() }

    }

    private fun operatorClick(operator: String) {
        currentOperator = operator
        currentOperand = tv.text.toString().toDouble()
        tv.text = currentOperator
    }

    private fun clearCalculator() {
        TODO("Not yet implemented")
    }

    private fun calculateResult() {
        val operand2 = tv.text.toString().toDouble()
        var result = 0.0

        when( currentOperator){
            "+" -> result = currentOperand + operand2
            "-" -> result = currentOperand - operand2
            "X" -> result = currentOperand * operand2
            "÷" -> result = currentOperand / operand2
        }
        tv.text = result.toString()
    }

    private fun numberClick(number : String) {
        val currentText = tv.text.toString()
        tv.text =currentText + number
    }
}