package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RopeClimbingActivity extends AppCompatActivity {
    private static double ropeclimbing_amt;
    private Button ropeclimbing_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rope_climbing);
        ropeclimbing_book=(Button)findViewById(R.id.btn_ropeclimbingbook);
        ropeclimbing_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ropeclimbing_amt=ropeclimbing_amt+100;
                startActivity(new Intent(RopeClimbingActivity.this,FinalActivity.class));
            }
        });


    }
    public static double getRopeclimbing_amt()
    {
        return ropeclimbing_amt;
    }
}
