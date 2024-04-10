package com.sis.myapplication.views


import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.sis.myapplication.viewmodel.QuoteViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun MainScreen(){
    val quoteVM: QuoteViewModel = viewModel()
    val frase by quoteVM.frase.observeAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = frase?.quote ?: "",
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = frase?.author ?: "",
            textAlign = TextAlign.Center,

            )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            quoteVM.randomQuote()
        }) {
            Text(text = "Siguiente frase")
        }
        
    }
}

@Preview()
@Composable
fun PreviewMainScrenn(){
    
    MainScreen()
}