package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.houston_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.spaceCenter_name), getString(R.string.spaceCenter_address), getString(R.string.spaceCenter_contact), getString(R.string.spaceCenter_details)));
        locations.add(new Location(getString(R.string.museum_name), getString(R.string.museum_address), getString(R.string.museum_contact), getString(R.string.museum_details)));
        locations.add(new Location(getString(R.string.zoo_name), getString(R.string.zoo_address), getString(R.string.zoo_contact), getString(R.string.zoo_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}