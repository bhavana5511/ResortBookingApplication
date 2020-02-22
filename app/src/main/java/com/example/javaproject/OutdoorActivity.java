package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OutdoorActivity extends AppCompatActivity {
    private Button basketball;
    private Button tennis;
    private Button golf;
    private Button cricket;
    private Button football;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor);
        SetUpView();
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OutdoorActivity.this, BasketBall.class));
            }
        });
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OutdoorActivity.this, CricketActivity.class));
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OutdoorActivity.this, TennisActivity.class));
            }
        });
        golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OutdoorActivity.this, GolfActivity.class));
            }
        });
        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OutdoorActivity.this, FootballActivity.class));
            }
        });
    }
    private void SetUpView()
    {
        basketball=(Button)findViewById(R.id.btn_basketballbook);
        tennis=(Button)findViewById(R.id.btn_tennisbook);
        golf=(Button)findViewById(R.id.btn_golfbook);
        cricket=(Button)findViewById(R.id.btn_cricketbook);
        football=(Button)findViewById(R.id.btn_footballbook);
    }
}
