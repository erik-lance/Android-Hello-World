package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Code
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
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

@Preview(showBackground = true)
@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Hero()
        Contacts()
    }
}

@Preview(showBackground = true)
@Composable
fun Hero() {
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Hello World!")
        Text(
            text = "This is my first Jetpack Compose app. " +
                "I'm excited to learn more and to use Kotlin!",
            fontSize = 8.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Author()
    }
}

@Composable
fun Author() {
    Text(
        text = "By: erik-lance",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Light,
        fontSize = 4.sp,
        modifier = Modifier
    )
}


/**
 * Lists socials (GitHub, LinkedIn, Twitter, etc.)
 */
@Preview(showBackground = true)
@Composable
fun Contacts() {
    val uriHandler = LocalUriHandler.current

    Row (
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .height(16.dp)
    ) {
        IconButton(onClick = {
            uriHandler.openUri("https://www.eriklance.com")
        }) {
            Icon(
                imageVector = Icons.Filled.Public,
                contentDescription = "Website"
            )
        }

        IconButton(onClick = {
            uriHandler.openUri("https://github.com/erik-lance")
        }) {
            Icon(
                imageVector = Icons.Filled.Code,
                contentDescription = "GitHub"
            )
        }
    }
}
