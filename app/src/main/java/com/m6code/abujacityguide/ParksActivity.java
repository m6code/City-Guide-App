package com.m6code.abujacityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.milinium, R.string.park_one, R.string.info_park_one,
                R.string.address_park_one, R.string.web_park_one,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0a4b03693325:0x2e0791297a581241?sa=X&amp;ved=0ahUKEwjIuYKWjIbVAhVSmbQKHe0NBT8Q9RcICzAA"));
        places.add(new Place(R.drawable.zoo, R.string.park_two, R.string.info_park_two,
                R.string.address_park_two, R.string.web_park_two,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0baaf0c5bde5:0xea93c728c84c6d1f?sa=X&amp;ved=0ahUKEwifi9-yl4bVAhVDblAKHRBMBecQ9RcICjAA"));
        places.add(new Place(R.drawable.rabby, R.string.park_three, R.string.info_park_three,
                R.string.address_park_three, R.string.web_park_three,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e75b914039a03:0xe28a509c444bd573?sa=X&amp;ved=0ahUKEwj-le2VmYbVAhXRI1AKHXiUCEoQ9RcICjAA"));
        places.add(new Place(R.drawable.maitama, R.string.park_four, R.string.info_park_four,
                R.string.address_park_four, R.string.web_park_four,
                "https://www.google.com.ng/maps/dir/\\'\\'/\\'\\'/data=!4m5!4m4!1m0!1m2!1m1!1s0x104e0a43d8aeb74f:0x5a876909d7a5ff13?sa=X&amp;ved=0ahUKEwjn34nDmYbVAhUFblAKHYAvCdMQ9RcICjAA"));


        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
