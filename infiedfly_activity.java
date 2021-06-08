package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infiedfly_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.double_plays);

        Button backIF;

        backIF = findViewById(R.id.backIF);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backIF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(infiedfly_activity.this, plays_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

