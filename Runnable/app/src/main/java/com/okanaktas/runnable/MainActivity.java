package com.okanaktas.runnable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Runnable runnable;
    Handler handler;
    TextView textView;
    Button buttonStart, buttonStop;

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        number = 0;
    }

    public void buttonStart(View view) {
        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                textView.setText("Time: "+ number);
                number++;
                textView.setText("Time: "+ number);
                handler.postDelayed(runnable,1000);
            }
        };

        handler.post(runnable);
        buttonStart.setEnabled(false);


    }

    public void buttonStop(View view) {
        buttonStart.setEnabled(true);

        handler.removeCallbacks(runnable);
        number = 0;
        textView.setText("Time: " + number);
    }

}