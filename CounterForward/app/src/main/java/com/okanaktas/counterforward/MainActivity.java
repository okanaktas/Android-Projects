package com.okanaktas.counterforward;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button buttonStart;

    Handler handler;
    Runnable runnable;

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonStart = findViewById(R.id.buttonStart);

    }

    public void buttonStart(View view) {

        handler = new Handler(Looper.getMainLooper());

        runnable = new Runnable() {
            @Override
            public void run() {
                number++;
                textView.setText("Counter: " + number);
                handler.postDelayed(runnable, 1000);
            }
        };

        handler.post(runnable);
        buttonStart.setEnabled(false);
    }

    public void buttonStop(View view) {
        handler.removeCallbacks(runnable);
        buttonStart.setEnabled(true);
    }
}