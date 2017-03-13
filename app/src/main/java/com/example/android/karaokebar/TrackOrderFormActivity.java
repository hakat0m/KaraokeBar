package com.example.android.karaokebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TrackOrderFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_order_form);


        // Get string parameter song name
        Bundle b = getIntent().getExtras();
        String songOrder = b.getString("song");

        // Set song title to the Text View
        TextView titleTextView = (TextView) findViewById(R.id.song_name);
        titleTextView.setText(songOrder);

    }
}
