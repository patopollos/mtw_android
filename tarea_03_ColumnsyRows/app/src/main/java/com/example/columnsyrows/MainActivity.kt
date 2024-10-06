package com.example.columnsyrows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.columnsyrows.ui.theme.ColumnsyRowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsyRowsTheme {
                Teclado(){}
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun Teclado(onButtonClick: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Row 1: 1, 2, 3, +
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            FormatoBotones("1", onButtonClick)
            FormatoBotones("2", onButtonClick)
            FormatoBotones("3", onButtonClick)
            FormatoBotones("+", onButtonClick)
        }

        // Row 2: 4, 5, 6, -
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            FormatoBotones("4", onButtonClick)
            FormatoBotones("5", onButtonClick)
            FormatoBotones("6", onButtonClick)
            FormatoBotones("-", onButtonClick)
        }

        // Row 3: 7, 8, 9, *
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            FormatoBotones("7", onButtonClick)
            FormatoBotones("8", onButtonClick)
            FormatoBotones("9", onButtonClick)
            FormatoBotones("*", onButtonClick)
        }

        // Row 4: 0, C, =, /
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            FormatoBotones("0", onButtonClick)
            FormatoBotones("C", onButtonClick)
            FormatoBotones("=", onButtonClick)
            FormatoBotones("/", onButtonClick)
        }
    }
}

@Composable
fun FormatoBotones(text: String, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        modifier = Modifier
            .size(80.dp) // Botón circular de 80dp
            .padding(8.dp), // Espaciado entre los botones
        shape = CircleShape, // Forma circular
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7E57C2)) // Color morado
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            color = Color.White // Texto en color blanco
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Teclado(){}
}