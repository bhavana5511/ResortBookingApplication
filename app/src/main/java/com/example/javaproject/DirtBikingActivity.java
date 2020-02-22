package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DirtBikingActivity extends AppCompatActivity {
    private static double dirtbiking_amt;
    private Button dirtbiking_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirt_biking);
        dirtbiking_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dirtbiking_amt=dirtbiking_amt+300;
                startActivity(new Intent(DirtBikingActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getDirtbiking_amt()
    {
        return dirtbiking_amt;

    }
}
