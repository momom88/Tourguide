package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView infoTextView = (TextView) findViewById(R.id.info_text);
        ImageView infoImage = (ImageView) findViewById(R.id.info_image);
        TextView nameTextView = (TextView) findViewById(R.id.info_name);

        // Receiving the intent extras that were put in the fragments
        final Bundle extras = getIntent().getExtras();

        // Getting the Views from xml
        nameTextView.setText(extras.getString(getString(R.string.name)));
        infoTextView.setText(extras.getString(getString(R.string.desc)));
        infoImage.setImageResource(extras.getInt(getString(R.string.image)));

    }

}
