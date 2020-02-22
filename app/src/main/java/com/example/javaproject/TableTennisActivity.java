package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableTennisActivity extends AppCompatActivity {
    private static double tt_amt;
    private Button tt_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_tennis);
        tt_book=(Button)findViewById(R.id.btn_ttbook);
        tt_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt_amt=tt_amt+200;
                startActivity(new Intent(TableTennisActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getTt_amt()
    {
        return tt_amt;
    }
}
