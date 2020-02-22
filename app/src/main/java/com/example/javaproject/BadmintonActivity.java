package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BadmintonActivity extends AppCompatActivity {
    private static double badminton_amt;
    private Button badminton_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);
        badminton_book=(Button)findViewById(R.id.btn_badmintonbook);
        badminton_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badminton_amt=badminton_amt+300;
                startActivity(new Intent(BadmintonActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getBadminton_amt()
    {
        return badminton_amt;
    }
}
