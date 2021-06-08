package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sacfly_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sacrifice_fly);

        Button backSF;

        backSF = findViewById(R.id.backSF);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backSF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sacfly_activity.this, plays_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

