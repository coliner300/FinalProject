package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class leftfield_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left_field);

        Button backLF;

        backLF = findViewById(R.id.backLF);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backLF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(leftfield_activity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

