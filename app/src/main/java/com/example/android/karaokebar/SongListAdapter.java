package com.example.android.karaokebar;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aga on 3/2/2017.
 * This class is an Adapter for a ListView
 * It represents queue of songs displayed in tab 'Stage'
 */

public class SongListAdapter extends ArrayAdapter<Song> {

    /**
    * @param context       The current context. Used to inflate the layout file.
    * @param pSongArrayList A List of Songs objects to display in a list
    **/
    public SongListAdapter(Activity context, ArrayList<Song> pSongArrayList) {

        super(context, 0, pSongArrayList);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem_scene, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the listitem_scene.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_scene_song_name);

        // Get the version name from the current Song object and
        // set this text on the name TextView
        defaultTextView.setText(currentSong.getSinger());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
