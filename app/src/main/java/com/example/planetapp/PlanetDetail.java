package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        intent.getExtras();
        planetModel planetModel=(planetModel) getIntent().getSerializableExtra("model");

        TextView textViewDesc=findViewById(R.id.planetDesc);
        TextView textViewFields=findViewById(R.id.planetFields);
        ImageView imageViewPlanet=findViewById(R.id.planetImage);

        textViewDesc.setText(planetModel.getPlanetDescription());
        textViewFields.setText(planetModel.getPlanetFields());
        imageViewPlanet.setImageResource(planetModel.getPlanetImage());
    }
}