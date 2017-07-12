package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.houston_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.cgbs_name), getString(R.string.cgbs_address), getString(R.string.cgbs_contact)));
        locations.add(new Location(getString(R.string.tot_name), getString(R.string.tot_address), getString(R.string.tot_contact)));
        locations.add(new Location(getString(R.string.eddie_name), getString(R.string.eddie_address), getString(R.string.eddie_contact)));
        locations.add(new Location(getString(R.string.uchi_name), getString(R.string.uchi_address), getString(R.string.uchi_contact)));
        locations.add(new Location(getString(R.string.saucer_name), getString(R.string.saucer_address), getString(R.string.saucer_contact)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
