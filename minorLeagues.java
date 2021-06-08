package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class minorLeagues extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minor_league);

        Button backML;

        backML = findViewById(R.id.backML);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backML.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(minorLeagues.this, differentLevels_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

