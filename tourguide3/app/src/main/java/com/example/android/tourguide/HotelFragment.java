package com.example.android.tourguide;


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
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.sport_hotel, R.string.sport_hotel_adress, R.drawable.sport));
        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        //Listener to the opec InfoActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentItem = places.get(position);
                Intent intent = new Intent(getActivity(), InfoActivity.class);
                intent.putExtra(getString(R.string.desc), getString(currentItem.getContent()));
                intent.putExtra(getString(R.string.image), currentItem.getImageResourceId());
                intent.putExtra(getString(R.string.name), getString(currentItem.getName()));
                startActivity(intent);

            }
        });
        return rootView;
    }

}

