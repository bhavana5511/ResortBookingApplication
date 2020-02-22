package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndoorActivity extends AppCompatActivity {
    private Button snooker;
    private Button tabletennis;
    private Button chess;
    private Button badminton;
    private Button carom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoor);
        setUpView();
        snooker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IndoorActivity.this, SnookerActivity.class));
            }
        });
        tabletennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IndoorActivity.this, TableTennisActivity.class));
            }
        });
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IndoorActivity.this, ChessActivity.class));
            }
        });
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IndoorActivity.this, BadmintonActivity.class));
            }
        });
        carom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IndoorActivity.this, CaromActivity.class));
            }
        });
    }
    private void setUpView()
    {
        snooker=(Button)findViewById(R.id.btn_snookerbook);
        tabletennis=(Button)findViewById(R.id.btn_ttbook);
        chess=(Button)findViewById(R.id.btn_chessbook);
        badminton=(Button)findViewById(R.id.btn_badmintonbook);
        carom=(Button)findViewById(R.id.btn_carombook);
    }
}
