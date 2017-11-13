package com.example.android.oldcitytour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LibertyFragment extends Fragment {

    public LibertyFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        final ArrayList<Tour> tour = new ArrayList<Tour>();

        tour.add(new Tour(R.string.liberty_head,R.drawable.liberty_bell,R.string.liberty_info));
        TourAdapter adapter = new TourAdapter(getActivity(), tour);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
