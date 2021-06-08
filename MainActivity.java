package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.positionButton);
        btn2 = findViewById(R.id.playsButton);
        btn3 = findViewById(R.id.levelsButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.batsound);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, positions_activity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, plays_activity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, differentLevels_activity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });
    }
}
