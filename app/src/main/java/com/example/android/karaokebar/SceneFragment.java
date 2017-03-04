package com.example.android.karaokebar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SceneFragment extends Fragment {


    public SceneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Create and populate list of song that will be displayed
        //in On scene tab.
        ArrayList<Song> songList = new ArrayList<Song>();

        songList.add(new Song("Janet", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        songList.add(new Song("Mark", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        songList.add(new Song("Annie", "The Chainsmokers feat. Halsey", "\"Closer\"" , R.drawable.annie));
        songList.add(new Song("Ken", "Rihanna", "\"Closer\"" , R.drawable.ken));
        songList.add(new Song("Abby", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        songList.add(new Song("Mark", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        songList.add(new Song("Annie", "The Chainsmokers feat. Halsey", "\"Closer\"" , R.drawable.annie));
        songList.add(new Song("Ken", "Rihanna", "\"Closer\"" , R.drawable.ken));

        View rootView = inflater.inflate(R.layout.fragment_scene, container, false);

        // Create an {@link SongListAdapter}, whose data source is a list of
        // {@link Song}s.
        SongListAdapter itemsAdapter = new SongListAdapter(getActivity(), songList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view_scene);
        listView.setAdapter(itemsAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
