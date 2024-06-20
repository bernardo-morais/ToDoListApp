package com.example.todolist

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import com.example.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val todoViewModel = ViewModelProvider(this)[TodoViewModel ::class.java]

        setContent {
            ToDoListTheme {

                TodoListPage(todoViewModel)

            }
        }
    }
}
