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
        places.add(new Place(R.drawable.grand_ibro, R.string.hotel_one));
        places.add(new Place(R.drawable.transcorp_hilton, R.string.hotel_two));
        places.add(new Place(R.drawable.orient_hotel, R.string.hotel_three));
        places.add(new Place(R.drawable.luziana_hotels, R.string.hotel_four));
        places.add(new Place(R.drawable.rockview_hotel, R.string.hotel_five));

        PlaceAdapter adapter = new PlaceAdapter(this,places);

        ListView listView = (ListView)findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}
