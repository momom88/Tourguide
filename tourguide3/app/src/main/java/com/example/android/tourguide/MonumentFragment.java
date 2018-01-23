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
public class MonumentFragment extends Fragment {


    public MonumentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        // Creating array of Item Objects
        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.string.most,R.string.most_info,
                R.drawable.most,R.drawable.most1));
        contents.add(new Content(R.string.castle,R.string.castle_info,R.drawable.zamek2,
                R.drawable.zamek21));
        contents.add(new Content(R.string.kostel,R.string.kostel_info,R.drawable.kostel,
                R.drawable.kostel1));
        contents.add(new Content(R.string.dva_herkulove,R.string.dva_herkulové_info,
                R.drawable.dvaherkulove,R.drawable.dvaherkulove1));
        contents.add(new Content(R.string.radnice,R.string.radnice_info,
                R.drawable.radnice,R.drawable.radnice1));
        contents.add(new Content(R.string.lottyhaus,R.string.lottyhaus_info,
                R.drawable.lottyhaus,R.drawable.lottyhaus1));
        contents.add(new Content(R.string.panny_marie,R.string.panny_marie_info,
                R.drawable.sochapanny,R.drawable.sochapanny1));
        ContentAdapter adapter = new ContentAdapter(getActivity(),contents);

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
