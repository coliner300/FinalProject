package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class positions_activity extends AppCompatActivity
{
    Button pitcher, catcher, first, second, shortstop, third, leftField, center, rightField, home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.positions);

        pitcher = findViewById(R.id.pitcherButton);
        catcher = findViewById(R.id.catcherButton);
        first = findViewById(R.id.firstBaseButton);
        second = findViewById(R.id.secondBaseButton);
        shortstop = findViewById(R.id.shortstopButton);
        third = findViewById(R.id.thirdBaseButton);
        leftField = findViewById(R.id.leftFieldButton);
        center = findViewById(R.id.centerFieldButton);
        rightField = findViewById(R.id.rightFieldButton);
        home = findViewById(R.id.homeButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        pitcher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, pitcherActivity.class));
                mediaPlayer.start();
            }
        });
        catcher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, catcherActvity.class));
                mediaPlayer.start();
            }
        });
        first.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, first_activity.class));
                mediaPlayer.start();
            }
        });
        second.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, second_activity.class));
                mediaPlayer.start();
            }
        });
        shortstop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, short_activity.class));
                mediaPlayer.start();
            }
        });
        third.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, third_activity.class));
                mediaPlayer.start();
            }
        });
        leftField.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, leftfield_activity.class));
                mediaPlayer.start();
            }
        });
        center.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, center_activity.class));
                mediaPlayer.start();
            }
        });
        rightField.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, rightfield_activity.class));
                mediaPlayer.start();
            }
        });

        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, MainActivity.class));
                mediaPlayer.start();
            }
        });

    }
}
