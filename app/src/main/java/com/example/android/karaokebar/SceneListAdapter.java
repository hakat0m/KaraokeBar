package com.example.android.karaokebar;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Aga on 3/2/2017.
 * This class is an Adapter for a ListView
 * It represents queue of songs displayed in tab 'Stage'
 */

public class SceneListAdapter extends ArrayAdapter {


    public SceneListAdapter(Activity context, int resource) {
        super(context, resource);
    }
}
