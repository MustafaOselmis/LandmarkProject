package com.mustafaoselmis.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mustafaoselmis.recyclerview.databinding.ActivityDetailedActiviityBinding;

public class DetailedActiviity extends AppCompatActivity {

    private ActivityDetailedActiviityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // View Binding
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedActiviityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //Casting
        LandMark selectedLandmark = (LandMark) intent.getSerializableExtra("Landmark");
        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}