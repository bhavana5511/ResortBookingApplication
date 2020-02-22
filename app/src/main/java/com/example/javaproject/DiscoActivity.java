package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiscoActivity extends AppCompatActivity {
    private Button disco_book;
    private static double disco_amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disco);
        disco_book=(Button)findViewById(R.id.btn_discobook);
        disco_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disco_amt=disco_amt+500;
                startActivity(new Intent(DiscoActivity.this,FinalActivity.class));
            }
        });

    }
    public static double getDisco_amt()
    {
        return disco_amt;
    }
}
