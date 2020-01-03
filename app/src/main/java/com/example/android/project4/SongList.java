/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.project4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.activity.ComponentActivity;

import java.util.ArrayList;

public class SongList extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        // Find different views on the layout to reference them in the java code
        // Find the Views on the title layout
        ImageButton titlePlay = findViewById(R.id.TitleLayoutPlay);
        // Set click listeners to all buttons
        // Set a click listener on the title layout
        // Intent to access the main activity layout
        titlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SongList.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        //Creating arrayList of Strings
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.drawable.disc, "Song Title 1", "Album 1", "Artist 1", "5:00"));
        songs.add(new Song(R.drawable.disc, "Song Title 2", "Album 2", "Artist 2", "6:00"));
        songs.add(new Song(R.drawable.disc, "Song Title 3", "Album 3", "Artist 2", "3:55"));
        songs.add(new Song(R.drawable.disc, "Song Title 4", "Album 4", "Artist 1", "3:55"));
        songs.add(new Song(R.drawable.disc, "Song Title 5", "Album 5", "Artist 2", "3:05"));
        songs.add(new Song(R.drawable.disc, "Song Title 6", "Album 6", "Artist 3", "2:55"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        songs.add(new Song(R.drawable.disc, "Song Title 7", "Album 7", "Artist 2", "1:40"));
        SongAdapter itemsAdapter = new SongAdapter(this, songs);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

    }
}
