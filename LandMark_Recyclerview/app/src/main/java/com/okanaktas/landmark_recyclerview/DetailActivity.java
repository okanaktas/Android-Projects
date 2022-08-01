package com.okanaktas.landmark_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.okanaktas.landmark_recyclerview.databinding.ActivityDetailBinding;
import com.okanaktas.landmark_recyclerview.databinding.ActivityMainBinding;

import org.w3c.dom.Text;


public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSelectedLandmark();

        binding.landmarkNameText.setText(selectedLandmark.name);
        binding.countryNameText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}
