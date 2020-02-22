package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CricketActivity extends AppCompatActivity {
    private static double cricket_amt=0;
    private Button cricket_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
        cricket_book=(Button)findViewById(R.id.btn_cricketbook);
        cricket_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               cricket_amt=cricket_amt+300;
                startActivity(new Intent(CricketActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getCricket_amt()
    {
        return cricket_amt;
    }
}
