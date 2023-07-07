package io.yanhao.compose.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleTextScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            SimpleText("Jeckpack Compose 边练边学")
        }
    )
}


@Composable
private fun SimpleText(displayText:String){
    Text(text = displayText)
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
private fun SimpleTextPreview(){
    SimpleText("Jeckpack Compose 边练边学")
}