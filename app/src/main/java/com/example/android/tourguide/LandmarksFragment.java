package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.houston_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.astrodome_name), getString(R.string.astrodome_address), R.drawable.astrodome, getString(R.string.astrodome_details)));
        locations.add(new Location(getString(R.string.waterwall_name), getString(R.string.waterwall_address), R.drawable.waterwall, getString(R.string.waterwall_details)));
        locations.add(new Location(getString(R.string.bush_name), getString(R.string.bush_address), R.drawable.bush, getString(R.string.bush_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
