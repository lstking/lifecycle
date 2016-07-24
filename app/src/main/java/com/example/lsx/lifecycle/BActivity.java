package com.example.lsx.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by lsx on 2016/7/24.
 */
public class BActivity extends AppCompatActivity {

    public String TAG = "BActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(TAG, "B Create");

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "B Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "B Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "B Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "B Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "B Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "B Destroy");
    }
}
