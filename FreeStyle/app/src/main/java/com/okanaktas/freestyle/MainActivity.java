package com.okanaktas.freestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import com.okanaktas.freestyle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long l) {
                        binding.textViewCounter.setText("Counter: " + l/1000);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Finished Time", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });

    }
}