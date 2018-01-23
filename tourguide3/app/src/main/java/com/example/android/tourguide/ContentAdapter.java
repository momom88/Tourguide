package com.example.android.tourguide;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    /**
     * Create a new {@link ContentAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param contents is the list of {@link Content}s to be displayed.
     */

    public ContentAdapter(Context context, ArrayList<Content> contents) {
        super(context, 0, contents);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Content} object located at this position in the list
        Content currentContent = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentContent.getName());

        TextView contentTextView = listItemView.findViewById(R.id.content_text_view);


        contentTextView.setText(currentContent.getiContent());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentContent.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentContent.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}