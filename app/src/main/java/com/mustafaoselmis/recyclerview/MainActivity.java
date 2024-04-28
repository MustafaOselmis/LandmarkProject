package com.mustafaoselmis.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.mustafaoselmis.recyclerview.databinding.ActivityDetailedActiviityBinding;
import com.mustafaoselmis.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    //static LandMark chosenLandmark;


    ArrayList<LandMark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        // Data

        LandMark pisa = new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark eyfel = new LandMark("Eyfel","France",R.drawable.eyfel);
        LandMark colessium = new LandMark("Colessium","Italy",R.drawable.kole);
        LandMark bridge = new LandMark("London Bridge","England",R.drawable.kopru);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eyfel);
        landmarkArrayList.add(colessium);
        landmarkArrayList.add(bridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);





        /*
        //Adapter
         //Listview

        //Mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listVew.setAdapter(arrayAdapter);

        binding.listVew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,landmarkArrayList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailedActiviity.class);
                intent.putExtra("Landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });


         */



    }
}