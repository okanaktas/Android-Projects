package com.okanaktas.counter_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewCounter);


    }

    public void buttonCounter(View view){

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                textView.setText("Counter: " + l/1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Finished Time", Toast.LENGTH_SHORT).show();
            }
        }.start();


    }
}