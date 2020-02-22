package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuhantaraActivity extends AppCompatActivity {
    private Button guhantara_book;
    private static double Guhantara_amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guhantara);
        guhantara_book = (Button) findViewById(R.id.btn_guhantara);
        guhantara_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuhantaraActivity.this, FinalActivity.class));
                Guhantara_amt = Guhantara_amt + 1499;
            }
        });
    }

    public static double getGuhantara_amt()
    {
        return Guhantara_amt;
    }
}
