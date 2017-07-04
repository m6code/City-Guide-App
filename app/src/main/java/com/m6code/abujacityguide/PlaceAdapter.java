package com.m6code.abujacityguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Benjamin on 4/7/2017.
 * An ArrayAdapter used to populate the ListView
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter {

    public PlaceAdapter(Context context, ArrayAdapter<Place> places){
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        TextView tvPlaceName = (TextView)listItemView.findViewById(R.id.tv_place_name);

        tvPlaceName.setText(currentPlace.getPlaceName());

        return listItemView;
    }
}
