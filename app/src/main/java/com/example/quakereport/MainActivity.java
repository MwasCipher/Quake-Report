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

       ArrayList<Quake> quakes = QueryUtils.extractEarthQuakes();

       listView = findViewById(R.id.list_view);
       arrayAdapter = new QuakeAdapter(getApplicationContext(), quakes);
       listView.setAdapter(arrayAdapter);


    }
}
