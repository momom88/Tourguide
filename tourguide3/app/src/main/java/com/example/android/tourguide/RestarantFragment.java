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

        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.string.baron_restarant, R.string.baron_restarant_info, R.drawable.baron, R.drawable.baron1));
        contents.add(new Content(R.string.castle_restarant, R.string.castle_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.ovecka_restarant, R.string.ovecka_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.larische_restarant, R.string.larische_restarant_info, R.drawable.karvinskypivovar, R.drawable.karvinskypivovar1));
        contents.add(new Content(R.string.baron_restarant, R.string.baron_restarant_info, R.drawable.baron, R.drawable.baron1));
        contents.add(new Content(R.string.castle_restarant, R.string.castle_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.ovecka_restarant, R.string.ovecka_restarant_info, R.drawable.ovecka, R.drawable.ovecka1));
        contents.add(new Content(R.string.larische_restarant, R.string.larische_restarant_info, R.drawable.karvinskypivovar, R.drawable.karvinskypivovar1));

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
