package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[]tasks ;
    private TextView textView;
    int currentIndex=0;

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onstop:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume: ");
    }

    //@Override
   // protected void onSaveInstanceState(Bundle saveInstanceState) {
     //   super.onSaveInstanceState(savedInstanceState);
        //savedInstanceState.putInt("TODO_INDEX",mTodoIndex);
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.setText(tasks[0]);
        Resources  res= getResources();
        tasks=res.getStringArray((R.array.todoapp));
    }

    public void next(View view) {
        //if(currentIndex <(tasks.length-1))
        currentIndex=++currentIndex%tasks.length;
        //currentIndex++;
        Log.d("Main Activity", "next: "+currentIndex);
        textView.setText(tasks[currentIndex]);
    }

    public void prev(View view) {

    }
    
    
}
