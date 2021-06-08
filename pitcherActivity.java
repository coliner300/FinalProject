package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pitcherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pitcher);

        Button backP;

        backP = findViewById(R.id.backP);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pitcherActivity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

        }

    }

