package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class highSchool extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.high_school);

        Button backHS;

        backHS = findViewById(R.id.backHS);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backHS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(highSchool.this, differentLevels_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

