package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    public static final String ToDoIndex="com.example.hellotoast";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("ToDoIndex",0);
        }
        mShowCount = (TextView) findViewById(R.id.show_count);
        mShowCount.setText(""+mCount);

//        detailButton = (Button) findViewById(R.id.button_roll);
//        detailButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, ToDoDetailActivity.class);
//                intent.putExtra(ToDoIndex, currentIndex);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("ToDoIndex", mCount);
    }

    @Override
    protected void onStart() {
        Log.d( "MainActivity", "onStart()");
        super.onStart();

    }

    @Override
    protected void onPause() {
        Log.d( "MainActivity", "onPause()");

        super.onPause();
    }

    @Override
    protected void onPostResume() {
        Log.d( "MainActivity", "onPostResume()");
        super.onPostResume();
    }

    @Override
    protected void onStop() {
        Log.d( "MainActivity", "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d( "MainActivity", "onDestroy()");
        super.onDestroy();
    }

    public void Toast(View view) {
        Toast toast;
        toast = Toast.makeText(this, R.string.HelloToast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void scrollGames(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
