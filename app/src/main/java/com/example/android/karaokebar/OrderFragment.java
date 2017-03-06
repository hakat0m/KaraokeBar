package com.example.android.karaokebar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

    private final String image_titles[] = {
            "Rihanna, \"This Is What You Came For\"",
            "Twenty one pilots, \"Heathens\"",
            "The Chainsmokers feat. Halsey, \"Closer\"",
            "Vanessa Carlton, \"A Thousand Miles\"",
            "Frozen, \"Let It Go\"",
            "All Star, \"Smash Mouth\"",
            "Cyndi Lauper, \"Girls Just Want To Have Fun\"",
            "Santana feat. Rob Thomas, \"Smooth\"",
            "Taylor Swift, \"New Romantics\"",
            "DNCE, \"Cake By The Ocean\"",
            "Mark Ronson feat. Bruno Mars, \"Uptown Funk\"",
            "The Proclaimers, \"I'm Gonna Be (500 Miles)\"",
            "Taylor Swift, \"New Romantics\"",
            "All Stars, \"Les Miserables\"",
    };

    private final Integer image_ids[] = {
            R.drawable.rihanna3,
            R.drawable.heathens,
            R.drawable.chainsmokers,
            R.drawable.vanessacarlton,
            R.drawable.frozen,
            R.drawable.smash,
            R.drawable.girls,
            R.drawable.sanatana,
            R.drawable.taylor,
            R.drawable.dnce,
            R.drawable.mars,
            R.drawable.chainsmokers,
            R.drawable.taylor,
            R.drawable.proclaimers,
    };

    private ArrayList<TrackOrder> prepareData() {

        ArrayList<TrackOrder> theimage = new ArrayList<>();
        for (int i = 0; i < image_titles.length; i++) {
            TrackOrder createList = new TrackOrder();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            theimage.add(createList);
        }
        return theimage;
    }


    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<TrackOrder> createLists = prepareData();
        TrackOrderAdapter adapter = new TrackOrderAdapter(getActivity().getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);

        // Set on click event handler for Order list items
        // When clicks on the song to go to form activity
        // RecyclerView doesn't have own setOnClickListener
        // but there is helper class ItemClickSupport
        RecyclerView orderRecyclerView = (RecyclerView) rootView.findViewById(R.id.imagegallery);
        ItemClickSupport.addTo(orderRecyclerView)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        Log.i("Order track","clicked");
                    }
                });

        return rootView;
    }

}
