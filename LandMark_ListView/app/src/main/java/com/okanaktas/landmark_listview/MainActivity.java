package com.okanaktas.landmark_listview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.okanaktas.landmark_listview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> arrayListLandMark;

    private ActivityMainBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        arrayListLandMark = new ArrayList<>();

        LandMark pisa = new LandMark("pisa", "Italy", R.drawable.pisa);
        LandMark eiffel = new LandMark("eiffel", "France", R.drawable.eiffel);
        LandMark colosseum = new LandMark("pisa", "Italy", R.drawable.colosseum);
        LandMark london_bridge = new LandMark("london_bridge", "UK", R.drawable.london_bridge);

        arrayListLandMark.add(pisa);
        arrayListLandMark.add(eiffel);
        arrayListLandMark.add(colosseum);
        arrayListLandMark.add(london_bridge);

        /*
        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, arrayListLandMark.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, arrayListLandMark.get(i).name, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("landmark", arrayListLandMark.get(i));
                startActivity(intent);
            }
        });
         */
    }
}