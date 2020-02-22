package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdventureActivity extends AppCompatActivity {
    private Button dirtbiking;
    private Button horseriding;
    private Button ropeclimbing;
    private Button trekking;
    private Button riverrafting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
        SetUpView();
        dirtbiking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdventureActivity.this,DirtBikingActivity.class));
            }
        });
        horseriding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdventureActivity.this,HorseRidingActivity.class));
            }
        });
        ropeclimbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdventureActivity.this,RopeClimbingActivity.class));
            }
        });
        trekking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdventureActivity.this,trekkingActivity.class));
            }
        });
        riverrafting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdventureActivity.this,RiverRaftingActivity.class));
            }
        });
    }
    private void SetUpView()
    {
        dirtbiking=(Button)findViewById(R.id.btn_dirt);
        horseriding=(Button)findViewById(R.id.btn_horse);
        ropeclimbing=(Button)findViewById(R.id.btn_rope);
        trekking=(Button)findViewById(R.id.btn_trekbook);
        riverrafting=(Button)findViewById(R.id.btn_river);
    }
}
