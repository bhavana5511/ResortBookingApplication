package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TennisActivity extends AppCompatActivity {
    private static double tennis_amt;
    private Button tennis_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);
        tennis_book=(Button)findViewById(R.id.btn_tennisbook);
        tennis_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tennis_amt=tennis_amt+200;
                startActivity(new Intent(TennisActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getTennis_amt()
    {
        return tennis_amt;
    }
}
