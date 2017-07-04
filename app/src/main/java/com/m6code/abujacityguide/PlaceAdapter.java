package com.m6code.abujacityguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Benjamin on 4/7/2017.
 * An ArrayAdapter used to populate the ListView
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {


    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Set the place name on the tv_place_name of the list_item.xml
        TextView tvPlaceName = (TextView) listItemView.findViewById(R.id.tv_place_name);

        // Get the place name from the currentWord object and set this text
        // on the tv_place_name TextView
        tvPlaceName.setText(currentPlace.getPlaceName());

        // Return the whole list item layout
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
