package com.example.ui_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_test.ui.theme.Ui_testTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ui_testTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Ui()
                }
            }
        }
    }
}

@Composable
fun Ui()
{
    UiProfile(
        Title = stringResource(R.string.title),
        Body = stringResource(R.string.body),
        Content = stringResource(R.string.content)
    )
    // we can call the composable function outside the component activity
}

@Composable
private fun UiProfile(Title: String, Body: String, Content: String) {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.jetpack),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = Title,
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = Body,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = Content,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}




@Preview(showBackground = true)
@Composable
fun UiProfilePreview() {
    Ui_testTheme {
        Ui()
    }
}

