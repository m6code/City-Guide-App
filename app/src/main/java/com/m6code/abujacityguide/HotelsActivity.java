package com.m6code.abujacityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.sheraton, R.string.hotel_one,
                R.string.decription_hotel_one, R.string.location_hotel_one,
                R.string.web_hotel_one,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0ba9806edb85:0x2625e67c71ff00c1?sa=X&amp;ved=0ahUKEwivgJezk4bVAhXQbVAKHcM2BKMQ9RcICzAA"));
        places.add(new Place(R.drawable.nicon, R.string.hotel_two,
                R.string.decription_hotel_two, R.string.location_hotel_two,
                R.string.web_hotel_two,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0b97c21f3d99:0x963ef58bc0742eae?sa=X&amp;ved=0ahUKEwjh1JqAlIbVAhWOmbQKHU-hDTwQ9RcICzAA"));
        places.add(new Place(R.drawable.transcorp, R.string.hotel_three,
                R.string.decription_hotel_three, R.string.location_hotel_three,
                R.string.web_hotel_three,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104dd42594163dd1:0x2b97d2308e5f8ee1?sa=X&amp;ved=0ahUKEwjk9PyklIbVAhVGJ1AKHYHlDMMQ9RcICzAA"));
        places.add(new Place(R.drawable.royal, R.string.hotel_four,
                R.string.decription_hotel_four, R.string.location_hotel_four,
                R.string.web_hotel_four,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0b2978085fc1:0xd1aa41f8dc23c47e?sa=X&amp;ved=0ahUKEwjKjPLVlIbVAhVFbFAKHeZ9CmoQ9RcICjAA"));
        places.add(new Place(R.drawable.peace, R.string.hotel_five,
                R.string.decription_hotel_five, R.string.location_hotel_five,
                R.string.web_hotel_five,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104ddf8b22f83d41:0x365ae61733d1405e?sa=X&amp;ved=0ahUKEwir1KXulIbVAhUJY1AKHb6aDp4Q9RcICzAA"));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorHome);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        //Launch google maps for a place when click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Set animation effect when view is clicked
                Animation animation = new AlphaAnimation(0.3f,1.0f);
                animation.setDuration(5000);
                view.startAnimation(animation);

                // get the place map id an launch a google map view of the place
                Place place = places.get(i);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(place.getPlaceMapID()));

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "No App to Handle Intent", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
