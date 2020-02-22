package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RiverRaftingActivity extends AppCompatActivity {
    private static double riverrafting_amt;
    private Button riverrafting_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river_rafting);
        riverrafting_book=(Button)findViewById(R.id.btn_riverraftingbook);
        riverrafting_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                riverrafting_amt=riverrafting_amt+200;
                startActivity(new Intent(RiverRaftingActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getRiverrafting_amt()
    {
        return riverrafting_amt;
    }
}
