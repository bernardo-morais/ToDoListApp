package com.example.todolist

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeToDo() : List<Todo>{
    return listOf<Todo>(
        Todo(1,"First todo ",Date.from(Instant.now())),
        Todo(2,"Second todo ",Date.from(Instant.now())),
        Todo(3,"This is my third todo ",Date.from(Instant.now())),
        Todo(4,"This will be my fourth todo so I can use it in UI ",Date.from(Instant.now()))

    );
}
