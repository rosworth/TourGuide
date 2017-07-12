package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.houston_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.discovery_name), getString(R.string.discovery_address), getString(R.string.discovery_contact), getString(R.string.discovery_details)));
        locations.add(new Location(getString(R.string.eisenhower_name), getString(R.string.eisenhower_address), getString(R.string.eisenhower_contact)));
        locations.add(new Location(getString(R.string.memorial_name), getString(R.string.memorial_address), getString(R.string.memorial_contact)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
