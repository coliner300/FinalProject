package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class rightfield_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_field);

        Button backRF;

        backRF = findViewById(R.id.backRF);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backRF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rightfield_activity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

