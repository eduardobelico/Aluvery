package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    CustomLayoutPreview()
                }
            }
            
        }
    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

//Modifiers - primeiro parâmetro opcional

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Cyan)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text("Texto 1")
        Text("Texto 2")
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp
                )
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(0.5f)
        ) {
            Text("Texto 3")
            Text("Texto 4")
        }
        Box(
            Modifier
                .padding(8.dp)
                .background(color = Color.Magenta)
                .padding(all = 8.dp)
                .width(200.dp)
        ) {
            Row(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Green)
                    .padding(all = 8.dp)
                    .fillMaxWidth()
            ) {
                Text("Texto 5")
                Text("Texto 6")
            }
            Column(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.DarkGray)
                    .padding(all = 8.dp)
            ) {
                Text("Texto 7")
                Text("Texto 8")
            }
        }
    }
}

// - BOX, ROW e COLUMN
//@Preview(showBackground = true)
//@Composable
//fun ColumnPreview(){
//    Column {
//        Text("Texto 1")
//        Text("Texto 2")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun RowPreview(){
//    Row {
//        Text("Texto 1")
//        Text("Texto 2")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun BoxPreview(){
//    Box {
//        Text("Texto 1")
//        Text("Texto 2")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun CustomLayoutPreview(){
//    Column {
//        Text("Texto 1")
//        Text("Texto 2")
//        Row {
//            Text("Texto 3")
//            Text("Texto 4")
//        }
//        Box {
//            Row {
//                Text("Texto 5")
//                Text("Texto 6")
//            }
//            Column {
//                Text("Texto 7")
//                Text("Texto 8")
//            }
//        }
//    }
//}

// - Testes com ui no preview -
//@Preview(
//    name = "TextPreviewLight",
//    showSystemUi = true
//)
//@Preview(
//    name = "TextPreviewDark",
//    showSystemUi = true,
//    uiMode = UI_MODE_NIGHT_YES
//)
//@Preview(
//    name = "TextPreview",
//    heightDp = 200,
//    widthDp = 300,
//    showBackground = true,
//    backgroundColor = 0xFFFF1144
//)
//@Composable
//fun MyFirstComposablePreview(){
//    AluveryTheme{
//        Surface {
//            MyFirstComposable()
//        }
//    }
//}

