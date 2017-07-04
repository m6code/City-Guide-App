package com.m6code.abujacityguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Hotel A"));
        places.add(new Place("Hotel b"));
        places.add(new Place("Hotel c"));

        PlaceAdapter adapter = new PlaceAdapter(this,places);

        ListView listView = (ListView)findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}
