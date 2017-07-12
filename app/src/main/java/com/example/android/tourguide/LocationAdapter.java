package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.tv_locationName);
        nameText.setText(currentLocation.getName());
        TextView addressText = (TextView) listItemView.findViewById(R.id.tv_locationAddress);
        addressText.setText(currentLocation.getAddress());
        TextView contactText = (TextView) listItemView.findViewById(R.id.tv_locationContact);
        if (currentLocation.getContact() == null) {
            contactText.setVisibility(View.GONE);
        }
        contactText.setText(currentLocation.getContact());
        TextView detailsText = (TextView) listItemView.findViewById(R.id.tv_locationDetails);
        if (currentLocation.getDetails() == null) {
            detailsText.setVisibility(View.GONE);
        }
        detailsText.setText(currentLocation.getDetails());
        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.iv_locationImage);
        if (currentLocation.hasImage()) {
            locationImage.setImageResource(currentLocation.getImageId());
            locationImage.setVisibility(View.VISIBLE);
        } else {
            locationImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
