package com.example.android.karaokebar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

    private final String image_titles[] = {
            "Img1",
            "Img2",
            "Img3",
            "Img4",
            "Img5",
            "Img6",
            "Img7",
            "Img8",
            "Img9",
            "Img10",
            "Img11",
            "Img12",
            "Img13",
    };

    private final Integer image_ids[] = {
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
            R.drawable.rihanna3,
    };

    private ArrayList<SongOrder> prepareData(){

        ArrayList<SongOrder> theimage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            SongOrder createList = new SongOrder();
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

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<SongOrder> createLists = prepareData();
        SongOrderAdapter adapter = new SongOrderAdapter(getActivity().getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
