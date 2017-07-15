package com.m6code.abujacityguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHotels = (TextView) findViewById(R.id.tv_hotels);

        tvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });


        TextView tvParks = (TextView) findViewById(R.id.tv_parks);
        tvParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });

        TextView tvRestaurants = (TextView) findViewById(R.id.tv_restaurants);
        tvRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView tvTourist = (TextView) findViewById(R.id.tv_tourist_site);
        tvTourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent touristIntent = new Intent(MainActivity.this, TouristsActivity.class);
                startActivity(touristIntent);
            }
        });
    }
}
