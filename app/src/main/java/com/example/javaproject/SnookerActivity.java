package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnookerActivity extends AppCompatActivity {
    private static double snooker_amt;
    private Button snooker_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snooker);
        snooker_book=(Button)findViewById(R.id.btn_snookerbook);
        snooker_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snooker_amt=snooker_amt+300;
                startActivity(new Intent(SnookerActivity.this,FinalActivity.class));
            }
        });


    }
    public static double getSnooker_amt(){
        return snooker_amt;
    }
}
