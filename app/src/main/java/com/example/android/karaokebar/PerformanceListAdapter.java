package com.example.android.karaokebar;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aga on 3/2/2017.
 * This class is an Adapter for a ListView
 * It represents queue of songs displayed in tab 'Stage'
 */

public class PerformanceListAdapter extends ArrayAdapter<Performance> {

    /**
     * @param context               The current context. Used to inflate the layout file.
     * @param pPerformanceArrayList A List of Songs objects to display in a list
     **/
    public PerformanceListAdapter(Activity context, ArrayList<Performance> pPerformanceArrayList) {

        super(context, 0, pPerformanceArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (position == 0) {
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.listitem_now_singing, parent, false);

                View fab = listItemView.findViewById(R.id.pink_icon);
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Thank you for voting", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });

            }
        }


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem_scene, parent, false);


            // Get the {@link Performance} object located at this position in the list
            Performance _currentPerformance = getItem(position);

            // Find the TextView in the listitem_scene.xml layout with the ID version_name
            ImageView photoImageView = (ImageView) listItemView.findViewById(R.id.list_item_scene_singer_photo);
            // Get the version name from the current Performance object and
            // set this text on the name TextView
            photoImageView.setImageResource(_currentPerformance.getImageResourceId());
            photoImageView.setVisibility(photoImageView.VISIBLE);

            TextView singerNameTextView = (TextView) listItemView.findViewById(R.id.list_item_scene_singer_name);
            singerNameTextView.setText(_currentPerformance.getSinger());

            TextView artistTextView = (TextView) listItemView.findViewById(R.id.list_item_scene_artist_name);
            String artistWithDash =
                    _currentPerformance.getArtist() + ' ' + getContext().getString(R.string.em_dash) + ' ';
            artistTextView.setText(artistWithDash);

            TextView titleTextView = (TextView) listItemView.findViewById(R.id.list_item_scene_song_name);
            titleTextView.setText(_currentPerformance.getTitle());
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
