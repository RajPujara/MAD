package com.example.todo_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.todo_detail.MainActivity.TodoIndex;

public class TodoDetailActivity extends AppCompatActivity {
 // int currentindex =0
    private TextView textView;
    private String[] todo_description;
    private Button backButton;
    //int currentIndex =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_detail);
        final Intent intent = getIntent();
        intent.getIntExtra(TodoIndex,0);
        textView = findViewById(R.id.textView);
        Resources res = getResources();
        todo_description = res.getStringArray(R.array.todo_description);
        int CurrentIndex = getIntent().getIntExtra(MainActivity.TODO_INDEX,0);

        textView = findViewById(R.id.textView);


        // textview.set textview ("CurrentIndex);

        textView.setText(todo_description[CurrentIndex]);


//        backButton = (Button) findViewById(R.id.back);
//        backButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(String.valueOf(MainActivity.class));
//                intent.putExtra(TodoIndex,currentIndex);
//                startActivity(intent);
//            }
//      });

    }

}
