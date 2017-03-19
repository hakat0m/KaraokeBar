package com.example.android.karaokebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.karaokebar.MainActivity._performanceList;

public class OderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_details);

        // Get string parameter song name
        Bundle b = getIntent().getExtras();
        String songOrder = b.getString("orderedSong");
        String singerName = b.getString("singerName");
        String singerEmail = b.getString("singerEmail");

        // Set song title to the Text View
        TextView titleTextView = (TextView) findViewById(R.id.ordered_song_name);
        titleTextView.setText(songOrder);

        // Set singer name to the Text View
        TextView singerNameTextView = (TextView) findViewById(R.id.singer_name);
        singerNameTextView.setText(singerName);

        // Set singer email to the Text View
        // TextView singerEmailTextView = (TextView) findViewById(R.id.singer_email);
        // singerEmailTextView.setText(singerEmail);

        // Add new performance details
        _performanceList.add(new Performance("Ken2", "Rihanna", "\"Closer\"", R.drawable.ken));


        // Find the login button. Login is not yet ready.
        // Click on login button redirects user to TabActivity
        Button loginButton = (Button) findViewById(R.id.back_to_scene_btn);

        loginButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               //Create new intent to open {@link TabbedActivity}
                                               Intent stageIntent = new Intent(OderDetailsActivity.this, TabbedActivity.class);

                                               //Start the new activity
                                               startActivity(stageIntent);
                                           }
                                       }
        );
    }
}
