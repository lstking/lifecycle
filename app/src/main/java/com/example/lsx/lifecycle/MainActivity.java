package com.example.lsx.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "A Create");

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "A Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "A Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "A Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "A Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "A Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "A Destroy");
    }
}
