package com.example.finalproject;

import android.content.Intent;
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

        pitcher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, pitcherActivity.class));
            }
        });
        catcher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, catcherActvity.class));
            }
        });
        first.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, first_activity.class));
            }
        });
        second.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, second_activity.class));
            }
        });
        shortstop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, short_activity.class));
            }
        });
        third.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, third_activity.class));
            }
        });
        leftField.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, leftfield_activity.class));
            }
        });
        center.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, center_activity.class));
            }
        });
        rightField.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, rightfield_activity.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(positions_activity.this, MainActivity.class));
            }
        });

    }
}
