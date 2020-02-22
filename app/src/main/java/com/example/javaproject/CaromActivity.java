package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CaromActivity extends AppCompatActivity {
    private static double carom_amt;
    private Button carom_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carom);
        carom_book=(Button)findViewById(R.id.btn_carombook);
        carom_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carom_amt=carom_amt+200;
                startActivity(new Intent(CaromActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getCarom_amt()
    {
        return carom_amt;
    }
}
