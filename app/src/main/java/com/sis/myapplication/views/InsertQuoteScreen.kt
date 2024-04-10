package com.sis.myapplication.views


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sis.myapplication.viewmodel.InsertQuoteViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InsertQuoteScreen(){

    var autor by remember { mutableStateOf("") }
    var frase by remember { mutableStateOf("") }
    val insertQuoteVM: InsertQuoteViewModel = viewModel()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Ingrese la frase")
        OutlinedTextField(
            value = frase,
            onValueChange = {
                frase = it
            },
        )

        Text(text = "Ingrese el autor")
        OutlinedTextField(
            value = autor,
            onValueChange = {
                autor = it
            },
        )

        Button(onClick = {
            insertQuoteVM.insertQuote(context, frase, autor)
        }) {
            Text(text = "Guardar" )
        }


    }
}

@Preview(showBackground = true, showSystemUi = true, )
@Composable
fun PreviewInsertQuoteScreen(){
    InsertQuoteScreen()
}