package com.m6code.abujacityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHotels = (TextView)findViewById(R.id.tv_hotels);

        tvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });
    }
}
