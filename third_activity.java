package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class third_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_base);

        Button backT;

        backT = findViewById(R.id.backT);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(third_activity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

    }

}

