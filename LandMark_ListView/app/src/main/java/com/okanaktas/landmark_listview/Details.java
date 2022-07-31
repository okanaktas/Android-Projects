package com.okanaktas.landmark_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.okanaktas.landmark_listview.databinding.ActivityDetailsBinding;
import com.okanaktas.landmark_listview.databinding.ActivityMainBinding;

public class Details extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        //casting (LandMark)
        LandMark selectedLandMark = (LandMark) intent.getSerializableExtra("landMark");

        binding.textViewName.setText(selectedLandMark.name);
        binding.textViewCountry.setText(selectedLandMark.country);
        binding.imageView.setImageResource(selectedLandMark.image);

    }
}