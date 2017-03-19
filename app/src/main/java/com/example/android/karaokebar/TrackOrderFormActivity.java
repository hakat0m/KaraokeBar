package com.example.android.karaokebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TrackOrderFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_order_form);


        // Get string parameter song name
        Bundle b = getIntent().getExtras();
        final String songOrder = b.getString("song");

        // Set song title to the Text View
        TextView titleTextView = (TextView) findViewById(R.id.song_name);
        titleTextView.setText(songOrder);

        // Find the login button. Login is not yet ready.
        // Click on login button redirects user to TabActivity
        Button sendOrderButton = (Button) findViewById(R.id.send_order_btn);

        sendOrderButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               // Create new intent to open {@link TabbedActivity}
                                               Intent formIntend = new Intent(TrackOrderFormActivity.this, OderDetailsActivity.class);

                                               // Set song title to the Text View
                                               EditText nameEditText = (EditText) findViewById(R.id.singer_name_input);
                                               String singerName = nameEditText.getText().toString();
                                               Log.i("TrackOrder", singerName);

                                               // Set song title to the Text View
                                               EditText emailEditText = (EditText) findViewById(R.id.singer_email_input);
                                               String singerEmail = emailEditText.getText().toString();

                                               // Pass parameter to a new activity
                                               formIntend.putExtra("orderedSong", songOrder);
                                               formIntend.putExtra("singerName", singerName);
                                               formIntend.putExtra("singerEmail", singerEmail);

                                               // Start the new activity
                                               startActivity(formIntend);
                                           }
                                       }
        );

    }
}
