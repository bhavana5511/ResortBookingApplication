package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trekkingActivity extends AppCompatActivity {
    private static double trekking_amt;
    private Button trekking_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trekking);
        trekking_book=(Button)findViewById(R.id.btn_trekbook);
        trekking_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trekking_amt=trekking_amt+300;
                startActivity(new Intent(trekkingActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getTrekking_amt()
    {
        return trekking_amt;
    }
}
