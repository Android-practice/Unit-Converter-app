package yj.practice.unitconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import yj.practice.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                    UnitConverter()
                }
            }
        }
    }
}


@Composable
fun UnitConverter() {
    Column { // column have row
        //Here all the UI elements will be stacked below each other ( element를 추가하면 세로방향으로 stack )
        Text("Unit Converter")
        Text("Unit Converter")
        OutlinedTextField(value = "", onValueChange = {
            //Here goes what should happen, when the value of our OutLinedTextField changes
        })
        Row {
            //context : which area of application should something happen?
            val context = LocalContext.current
            //Here all the UI elements will be stacked below each other ( element를 추가하면 가로방향으로 stack )
            Button(onClick = {
                Toast.makeText(
                    context,
                    "Thanks for clicking!",
                    Toast.LENGTH_LONG
                ).show()
            }) {
                Text("Click me!")
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}