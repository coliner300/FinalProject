package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class catcherActvity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catcher);

        Button backC;

        backC = findViewById(R.id.backC);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        backC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(catcherActvity.this, positions_activity.class));
                mediaPlayer.start();
            }
        });

    }

}
