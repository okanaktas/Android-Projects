package com.okanaktas.intent_getintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);

    }

    public void goToActivity(View view){
        name = editText.getText().toString(); //Bunu onCreate e yazarsan çalışmıyor.

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
}