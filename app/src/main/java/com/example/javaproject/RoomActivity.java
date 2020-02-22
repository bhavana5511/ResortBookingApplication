package com.example.javaproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoomActivity extends AppCompatActivity {
    private Button regular;
    private Button deluxe;
    private Button suite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        setUpView();
        regular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoomActivity.this,RegularActivity.class));
            }

        });
        deluxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoomActivity.this,DeluxeActivity.class));
            }

        });
        suite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoomActivity.this,SuiteActivity.class));
            }

        });
    }
    private void setUpView()
    {
        regular=(Button)findViewById(R.id.btn_regular);
        deluxe=(Button)findViewById((R.id.btn_deluxe));
        suite=(Button)findViewById(R.id.btn_suite);
    }
}
