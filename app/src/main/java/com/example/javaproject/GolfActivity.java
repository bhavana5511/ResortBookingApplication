package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GolfActivity extends AppCompatActivity {
    private static double golf_amt=0;
    private Button golf_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golf);
        golf_book=(Button)findViewById(R.id.btn_golfbook);
        golf_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golf_amt=golf_amt+100;
                startActivity(new Intent(GolfActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getGolf_amt()
    {
        return golf_amt;
    }
}
