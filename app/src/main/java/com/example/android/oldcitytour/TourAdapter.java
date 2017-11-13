package com.example.android.oldcitytour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;;
import java.util.ArrayList;

import static java.security.AccessController.getContext;


/**
 * Created by Nicholas on 3/18/2017.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    private  static final String Log_TAG = TourAdapter.class.getSimpleName();


    public TourAdapter(Activity context, ArrayList<Tour> tour){

        super (context,0,tour);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_item, parent, false);
        }

        Tour currentTour = getItem(position);

        // Find the TextView in the tour_item.xml layout with the ID version_name
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.tour_item_header);
        // set this text on the name TextView
        headerTextView.setText(currentTour.getTourHeader());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentTour.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTour.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //same as above with headerTextView
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.tour_item_info);
        infoTextView.setText(currentTour.getTourInfo());


        return listItemView;
    }
}
