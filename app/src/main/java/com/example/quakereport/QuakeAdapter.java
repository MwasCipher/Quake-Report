package com.example.quakereport;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class QuakeAdapter extends ArrayAdapter<Quake> {


    public QuakeAdapter(@NonNull Context context, int resource, @NonNull List<Quake> quakes) {
        super(context, resource, quakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        return super.getView(position, convertView, parent);
    }
}
