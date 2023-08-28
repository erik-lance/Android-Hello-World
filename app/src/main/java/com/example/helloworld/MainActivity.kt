package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Hero()
    }
}

@Preview(showBackground = true)
@Composable
fun Hero() {
    Column {
        Text("Hello World!")
        Author()
    }
}

@Composable
fun Author() {
    Text(
        text = "By: erik-lance",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Light,
        fontSize = 5.sp,
        modifier = Modifier
    )
}

/**
 * Lists socials (GitHub, LinkedIn, Twitter, etc.)
 */
@Preview(showBackground = true)
@Composable
fun Contacts() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text("Website")
        Text("GitHub")
    }
}
