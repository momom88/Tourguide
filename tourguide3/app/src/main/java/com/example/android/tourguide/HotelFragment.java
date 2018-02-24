package com.example.android.tourguide;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        // Creating array of Item Objects
        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.string.sport_hotel, R.string.sport_hotel_adress, R.drawable.sport, R.drawable.stars1));
        // Create an {@link ContentAdapter}, whose data source is a list of {@link Content}s. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);
        // Create an {@link ContentAdapter}, whose data source is a list of {@link Content}s. The
        // adapter knows how to create list items for each item in the list.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ContentAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Content} in the list.
        listView.setAdapter(adapter);
        //Listener to the opec InfoActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content currentItem = contents.get(position);
                Intent intent = new Intent(getActivity(), InfoActivity.class);
                intent.putExtra("desc", getString(currentItem.getContent()));
                intent.putExtra("image", currentItem.getmImageResourceIdBig());
                intent.putExtra("name", getString(currentItem.getName()));
                startActivity(intent);

            }
        });
        return rootView;
    }

}

