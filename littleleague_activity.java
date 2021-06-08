package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class littleleague_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.little_league);

        Button backLL;

        backLL = findViewById(R.id.backLL);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backLL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(littleleague_activity.this, differentLevels_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

