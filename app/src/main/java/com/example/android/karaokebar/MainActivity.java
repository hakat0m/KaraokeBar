package com.example.android.karaokebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Performance> _performanceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the login button. Login is not yet ready.
        // Click on login button redirects user to TabActivity
        Button loginButton = (Button) findViewById(R.id.buttonLogin);

        //Create and populate list of song that will be displayed
        //in On scene tab.
        _performanceList = new ArrayList<Performance>();


        _performanceList.add(new Performance("Janet", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        _performanceList.add(new Performance("Mark", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        _performanceList.add(new Performance("Annie", "The Chainsmokers feat. Halsey", "\"Closer\"", R.drawable.annie));
        _performanceList.add(new Performance("Ken", "Rihanna", "\"Closer\"", R.drawable.ken));
        _performanceList.add(new Performance("Abby", "Rihanna", "\"This Is What You Came For\"", R.drawable.abby));
        _performanceList.add(new Performance("Jay", "Twenty one pilots", "\"Heathens\"", R.drawable.mark));
        _performanceList.add(new Performance("Martha", "The Chainsmokers feat. Halsey", "\"Closer\"", R.drawable.annie));
        _performanceList.add(new Performance("Jen", "Rihanna", "\"Last in the list\"", R.drawable.ken));

        loginButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   //Create new intent to open {@link TabbedActivity}
                   Intent stageIntent = new Intent(MainActivity.this, TabbedActivity.class);

                   //Start the new activity
                   startActivity(stageIntent);
               }
           }
        );
    }
}
