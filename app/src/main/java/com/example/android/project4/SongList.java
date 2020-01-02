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

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Creating arrayList of Strings
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.drawable.disc,"Song Title 1","Album 1","Artist 1","5:00"));
        songs.add(new Song(R.drawable.disc,"Song Title 2","Album 2","Artist 2","6:00"));
        songs.add(new Song(R.drawable.disc,"Song Title 3","Album 3","Artist 2","3:55"));


        SongAdapter itemsAdapter = new SongAdapter(this, songs);
        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(itemsAdapter);

    }
}
