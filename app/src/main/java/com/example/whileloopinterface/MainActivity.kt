package com.example.whileloopinterface

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whileloopinterface.ui.theme.WhileLoopInterfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputNumber = findViewById<EditText>(R.id.editNumber)
        val resultText = findViewById<TextView>(R.id.txtResult)
        val button = findViewById<Button>(R.id.btnShow)

        button.setOnClickListener {

            val number = inputNumber.text.toString().toInt()

            var i = 1
            var result = ""

            while (i <= number){
                result +="$i"
                i++
            }
            resultText.text = result
        }



    }
}
