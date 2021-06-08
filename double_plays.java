package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class double_plays extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.double_plays);

        Button backDP;

        backDP = findViewById(R.id.backDP);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backDP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(double_plays.this, plays_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

