package com.example.todo_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class TodoDetailActivity extends AppCompatActivity {
 // int currentindex =0
    private TextView textView;
    private String[] todo_description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_detail);
        Intent intent = getIntent();
        intent.getIntExtra(MainActivity.TodoIndex,0);
        textView = findViewById(R.id.textView);
        Resources res = getResources();
        todo_description = res.getStringArray(R.array.todo_description);
        int CurrentIndex = getIntent().getIntExtra(MainActivity.TODO_INDEX,0);

        textView = findViewById(R.id.textView);


        // textview.set textview ("CurrentIndex);

        textView.setText(todo_description[CurrentIndex]);
    }

}
