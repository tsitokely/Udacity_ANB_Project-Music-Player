package com.example.android.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find different views on the layout to reference them in the java code
        // Find the Views on the title layout
        final ImageButton titlePlay = (ImageButton) findViewById(R.id.TitleLayoutPlay);
        final ImageButton titleList = (ImageButton) findViewById(R.id.TitleLayoutList);

        // Set click listeners to all buttons
        // Set a click listener on the title layout
        // Intent to access the main activity layout
        titlePlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TitleLayoutPlay View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        // Intent to access the list activity layout
        titleList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TitleLayoutPlay View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(mainIntent);
            }
        });



    }
}
