package com.example.android.tour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yuanyi on 2017/1/3.
 */

public class itemAdapter extends ArrayAdapter<item> {
    public itemAdapter(Activity context, ArrayList<item> items) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.city_list_item, parent, false);
        }

        item currentitem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.city_name);
        nameTextView.setText(currentitem.getName());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.city_location);
        locationTextView.setText(currentitem.getLocation());

        TextView contentTextView = (TextView) listItemView.findViewById(R.id.city_content);
        contentTextView.setText(currentitem.getContent());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.pic);
        if(currentitem.hasImage()) {
            imageView.setImageResource(currentitem.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


