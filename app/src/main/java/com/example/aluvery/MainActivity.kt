package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme{
                Surface {
                    MyFirstComposable()
                }
            }
            
        }
    }
}

@Composable
fun MyFirstComposable(){
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview(name = "TextPreviewLight",
    showSystemUi = true
)
@Preview(name = "TextPreviewDark",
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "TextPreview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xFFFF1144
)
@Composable
fun MyFirstComposablePreview(){
    AluveryTheme{
        Surface {
            MyFirstComposable()
        }
    }
}

