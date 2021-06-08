package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class center_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.center_field);

        Button backCF;

        backCF = findViewById(R.id.backCF);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backCF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(center_activity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

