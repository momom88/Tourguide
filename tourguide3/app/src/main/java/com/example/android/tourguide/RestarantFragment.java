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
public class RestarantFragment extends Fragment {


    public RestarantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        // Creating array of Item Objects
        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.string.baron_restarant, R.string.baron_restarant_info, R.drawable.baron, R.drawable.baron1));
        contents.add(new Content(R.string.castle_restarant, R.string.castle_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.ovecka_restarant, R.string.ovecka_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.larische_restarant, R.string.larische_restarant_info, R.drawable.karvinskypivovar, R.drawable.karvinskypivovar1));
        contents.add(new Content(R.string.baron_restarant, R.string.baron_restarant_info, R.drawable.baron, R.drawable.baron1));
        contents.add(new Content(R.string.castle_restarant, R.string.castle_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.ovecka_restarant, R.string.ovecka_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.larische_restarant, R.string.larische_restarant_info, R.drawable.karvinskypivovar, R.drawable.karvinskypivovar1));
        // Create an {@link ContentAdapter}, whose data source is a list of {@link Content}s. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_list.xml layout file.
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
