package com.okanaktas.sharedprefences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        sharedPreferences = this.getSharedPreferences("com.okanaktas.sharedprefences", MODE_PRIVATE);

        int storedAge = sharedPreferences.getInt("storedAge", 0);

        if (storedAge == 0) {
            textView.setText("Your Age: ");
        } else {
            textView.setText("Your Age: " + storedAge);
        }


    }

    public void save(View view) {

        if (!editText.getText().toString().matches("")) {
            int numberAge = Integer.parseInt(editText.getText().toString().trim());
            textView.setText("Your Age: " + numberAge);

            sharedPreferences.edit().putInt("storedAge", numberAge).apply();
        }

    }
}