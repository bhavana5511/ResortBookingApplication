package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HorseRidingActivity extends AppCompatActivity {
    private static double horseriding_amt;
    private Button horseridingbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horse_riding);
        horseridingbook=(Button)findViewById(R.id.btn_horseridingbook);
        horseridingbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horseriding_amt=horseriding_amt+200;
                startActivity(new Intent(HorseRidingActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getHorseriding_amt()
    {
        return horseriding_amt;
    }
}
