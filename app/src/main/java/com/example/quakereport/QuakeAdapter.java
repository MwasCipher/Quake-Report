package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuakeAdapter extends ArrayAdapter<Quake> {


    public QuakeAdapter(@NonNull Context context, @NonNull ArrayList<Quake> quakes) {
        super(context, 0, quakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.quake_item, parent, false);
        }

        Quake currentQuake = getItem(position);

        TextView magnitudeView = listItemView.findViewById(R.id.quake_magnitude_text_view);
        magnitudeView.setText(currentQuake.getmMagnitude());

        TextView locationView = listItemView.findViewById(R.id.quake_location_text_view);
        locationView.setText(currentQuake.getmLocation());

        TextView dateView = listItemView.findViewById(R.id.quake_date_text_view);
        dateView.setText(currentQuake.getmDate());



        return listItemView;
    }
}
