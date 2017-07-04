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
        places.add(new Place(R.string.hotel_one));
        places.add(new Place(R.string.hotel_two));
        places.add(new Place(R.string.hotel_three));

        PlaceAdapter adapter = new PlaceAdapter(this,places);

        ListView listView = (ListView)findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}
