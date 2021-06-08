package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class plays_activity extends AppCompatActivity
{
    Button doublePlay, infieldFly, sacrificeFly, home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plays);

        doublePlay = findViewById(R.id.doublePlayButton);
        infieldFly = findViewById(R.id.infieldFlyButton);
        sacrificeFly = findViewById(R.id.sacFlyButton);
        home = findViewById(R.id.homeButton2);

        doublePlay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(plays_activity.this, double_plays.class));
            }
        });

        infieldFly.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(plays_activity.this, infiedfly_activity.class));
            }
        });

        sacrificeFly.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(plays_activity.this, sacfly_activity.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(plays_activity.this, MainActivity.class));
            }
        });


    }
}
