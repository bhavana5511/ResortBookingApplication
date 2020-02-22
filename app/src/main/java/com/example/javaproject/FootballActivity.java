package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FootballActivity extends AppCompatActivity {
    private static double football_amt;
    private Button footballbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
        footballbook=(Button)findViewById(R.id.btn_footballbook);
        footballbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                football_amt=football_amt+200;
                startActivity(new Intent(FootballActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getFootball_amt()
    {
        return football_amt;
    }
}
