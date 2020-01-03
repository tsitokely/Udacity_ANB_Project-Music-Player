package com.example.android.project4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {
    private boolean play = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find different views on the layout to reference them in the java code
        // Find the Views on the title layout
        ImageButton titleList = findViewById(R.id.TitleLayoutList);
        final ImageButton playButton = findViewById(R.id.MainLayoutPlay);
        playButton.setImageResource(R.drawable.ic_shortcut_play_arrow);
        // Set click listeners the main layout
        // Intent to play.pause button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play) {
                    playButton.setImageResource(R.drawable.ic_shortcut_play_arrow);
                    play = false;
                } else {
                    playButton.setImageResource(R.drawable.ic_shortcut_pause);
                    play = true;
                }
            }

        });
        // Intent to access the list activity layout
        titleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(listIntent);
                finish();
            }
        });
    }
}
