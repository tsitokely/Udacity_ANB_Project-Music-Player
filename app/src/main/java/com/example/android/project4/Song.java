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


/**
 * {@link Song} represents a song object with:thumbnail, title,album,artist,duration
 *
 */
public class Song {

    /** Thumbnail attached to the song */
    private int mSongThumb;
    /** Title of the song */
    private String mSongTitle;

    /** Album of the song */
    private String mSongAlbum;

    /** Album of the song */
    private String mArtist;

    /** Album of the song */
    private String mDuration;

    /**
     * Create a new Song object.
     *
     * @param thumbnail is the thumbnail associated with the song
     * @param title is the title of the song itself
     * @param album is the album tied to the song
     * @param artist is the artist performing the song
     * @param duration is the duration of the song
     */
    public Song(int thumbnail, String title, String album, String artist, String duration) {
        mSongThumb = thumbnail;
        mSongTitle = title;
        mSongAlbum = album;
        mArtist = artist;
        mDuration = duration;
    }

    /**
     * Get the song album
     */
    public int getThumbs() {
        return mSongThumb;
    }

    /**
     * Get the song title
     */
    public String getTitle() {
        return mSongTitle;
    }

    /**
     * Get the song album
     */
    public String getAlbum() {
        return mSongAlbum;
    }


    /**
     * Get the song artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the song duration
     */
    public String getDuration() {
        return mDuration;
    }
}