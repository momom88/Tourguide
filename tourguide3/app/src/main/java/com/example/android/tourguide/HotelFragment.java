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

        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.string.sport_hotel, R.string.sport_hotel_adress, R.drawable.sport,R.drawable.stars1));
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content currentItem = contents.get(position);
                Intent intent = new Intent(getActivity(), InfoActivity.class);
                intent.putExtra("desc", getString(currentItem.getiContent()));
                intent.putExtra("image", currentItem.getmImageResourceIdBig());
                intent.putExtra("name", getString(currentItem.getName()));
                startActivity(intent);

            }
        });
        return rootView;
    }

}

