package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class differentLevels_activity extends AppCompatActivity {

    Button LL, HS, ML, major, home3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.different_levels);

        LL = findViewById(R.id.littleLeagueButton);
        HS = findViewById(R.id.highSchoolButton);
        ML = findViewById(R.id.minorLeagueButton);
        major = findViewById(R.id.majorLeagueButton);
        home3 = findViewById(R.id.homeButton3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        LL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(differentLevels_activity.this, littleleague_activity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        HS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(differentLevels_activity.this, highSchool.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        ML.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(differentLevels_activity.this, minorLeagues.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        major.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(differentLevels_activity.this, majorLeagues.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        home3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(differentLevels_activity.this, MainActivity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

    }
}
