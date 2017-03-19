package com.example.android.karaokebar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

import static com.example.android.karaokebar.MainActivity._performanceList;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SceneFragment extends Fragment {




    public SceneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_scene, container, false);

        // Create an {@link PerformanceListAdapter}, whose data source is a list of
        // {@link Performance}s.
        PerformanceListAdapter itemsAdapter = new PerformanceListAdapter(getActivity(), _performanceList);
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
