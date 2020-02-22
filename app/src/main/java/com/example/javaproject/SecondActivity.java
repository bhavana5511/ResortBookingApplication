package com.example.javaproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button Room;
    private Button Sports;
    private Button Food;
    private Button Bill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setUpViews1();
        Room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,RoomActivity.class));
            }
        });
        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,FunActivity.class));

            }
        });
        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,FoodActivity.class));

            }
        });
        Bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,BillActivity.class));

            }
        });
    }
    private void setUpViews1()
    {
        Room=(Button)findViewById(R.id.btnRoom);
        Sports=(Button)findViewById(R.id.btn_sports);
        Food=(Button)findViewById(R.id.btn_food);
        Bill=(Button)findViewById(R.id.btn_secondbill);
    }
}
