package com.example.android.karaokebar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SceneFragment extends Fragment {

    public ArrayList<Performance> _performanceList;


    public SceneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Create and populate list of song that will be displayed
        //in On scene tab.
        _performanceList = new ArrayList<Performance>();

        _performanceList.add(new Performance("Janet", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        _performanceList.add(new Performance("Mark", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        _performanceList.add(new Performance("Annie", "The Chainsmokers feat. Halsey", "\"Closer\"", R.drawable.annie));
        _performanceList.add(new Performance("Ken", "Rihanna", "\"Closer\"", R.drawable.ken));
        _performanceList.add(new Performance("Abby", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        _performanceList.add(new Performance("Mark", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        _performanceList.add(new Performance("Annie", "The Chainsmokers feat. Halsey", "\"Closer\"", R.drawable.annie));
        _performanceList.add(new Performance("Ken", "Rihanna", "\"Closer\"", R.drawable.ken));

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
