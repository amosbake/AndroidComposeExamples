package io.yanhao.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.yanhao.compose.core.LearnSection
import io.yanhao.compose.core.getLearnSections

@Composable
fun HomeScreen(navController: NavController){
    LazyColumn(modifier = Modifier.fillMaxHeight()){
        items(items = getLearnSections(), itemContent = {section ->
            LearnSectionItem(section,navController)
        })
    }
}

@Composable
fun LearnSectionItem(sectionData: LearnSection,navController: NavController?) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp).clickable {
                navController?.navigate(sectionData.route.name)
            }
    ) {
        Card(
            shape = RoundedCornerShape(4.dp), modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                sectionData.name, style = androidx.compose.ui.text.TextStyle(
                    color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center
                ), modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun LearnSectionItemPreview(){
    LearnSectionItem(sectionData = getLearnSections()[0],null)
}