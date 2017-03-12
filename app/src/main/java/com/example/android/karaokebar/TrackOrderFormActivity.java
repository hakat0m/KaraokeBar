package com.example.android.karaokebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TrackOrderFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_order_form);

        Bundle b = getIntent().getExtras();
        String songOrder = b.getString("song");
        Log.i("Ordered Song: ", songOrder);

    }
}
