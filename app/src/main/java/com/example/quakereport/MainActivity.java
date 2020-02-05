package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private QuakeAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ArrayList<Quake> quakes = new ArrayList<>();
       quakes.add(new Quake("71", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("7", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("1", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("17", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("6", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("6", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("9", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("5", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("9", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("3", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("8", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("1", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("7", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("6", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("3", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("8", "Riruta", "9 Sep 2091"));
       quakes.add(new Quake("2", "Riruta", "9 Sep 2091"));

       listView = findViewById(R.id.list_view);
       arrayAdapter = new QuakeAdapter(getApplicationContext(), quakes);
       listView.setAdapter(arrayAdapter);


    }
}
