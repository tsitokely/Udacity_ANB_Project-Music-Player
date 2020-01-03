package com.example.android.project4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param Song    A List of Word objects to display in a list
     */

    public SongAdapter(Activity context, ArrayList<Song> Song) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Song);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentWord = getItem(position);
        // Find the thumbnail in the list_item.xml layout with the appropriate id
        ImageView songThumbs = listItemView.findViewById(R.id.list_song_thumbnail);
        // set the image
        songThumbs.setImageResource(currentWord.getThumbs());
        // Find the title in the list_item.xml layout with the appropriate id
        TextView songTitle = listItemView.findViewById(R.id.list_song_title);
        // set the title
        songTitle.setText(currentWord.getTitle());
        // Find the album in the list_item.xml layout with the appropriate id
        TextView songAlbum = listItemView.findViewById(R.id.list_song_album);
        // set the album
        songAlbum.setText(currentWord.getAlbum());
        // Find the artist in the list_item.xml layout with the appropriate id
        TextView songArtist = listItemView.findViewById(R.id.list_song_artist);
        // set the artist
        songArtist.setText(currentWord.getArtist());
        // Find the duration in the list_item.xml layout with the appropriate id
        TextView songDuration = listItemView.findViewById(R.id.list_song_duration);
        // set the duration
        songDuration.setText(currentWord.getDuration());
        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
