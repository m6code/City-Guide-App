package com.m6code.abujacityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class TouristsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.mosque,R.string.tourist_one,R.string.info_tourist_one,
                R.string.address_tourist_one,R.string.web_tourist_one,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0baf00555353:0x306c5459fc30896d?sa=X&amp;ved=0ahUKEwi9rt32h4bVAhUCmrQKHchhA8kQ9RcICzAA "));
        places.add(new Place(R.drawable.zuma,R.string.tourist_two,R.string.info_tourist_two,
                R.string.address_tourist_two,R.string.web_tourist_two,
                "https://www.google.com.ng/maps/place/Zuma+Rock/data=!4m2!3m1!1s0x104dd7d112caed1b:0xb415df4f7772bdb8!5m1!1e4?sa=X&amp;ved=0ahUKEwj089D9jobVAhWEEVAKHZ5oD3gQ8gEIfzAP"));
        places.add(new Place(R.drawable.aso,R.string.tourist_three,R.string.info_tourist_three,
                R.string.address_tourist_three,R.string.web_tourist_three,
                "https://www.google.com.ng/maps/place/Aso+Rock/@9.083333,7.5339223,17z/data=!3m1!4b1!4m5!3m4!1s0x104e0991e66fddfb:0x9d4da92741f9018!8m2!3d9.083333!4d7.536111!5m1!1e4"));
        places.add(new Place(R.drawable.stadium,R.string.tourist_four,R.string.info_tourist_four,
                R.string.address_tourist_four,R.string.web_tourist_four,
                "https://www.google.com.ng/maps/dir/\\'\\'/Location+of+the+national+stadium+abuja/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0b5a334275eb:0x3a912395bd8b3a54?sa=X&amp;ved=0ahUKEwjjmuXojYbVAhVObVAKHaDICOcQ9RcIjgEwDA"));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorHome);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // get the place map id an launch a google map view of the place
                Place place = places.get(i);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(place.getPlaceMapID()));

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "No App to Handle Intent", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
