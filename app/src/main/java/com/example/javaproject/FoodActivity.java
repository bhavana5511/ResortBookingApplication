package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {
    private Button chinese;
    private Button northIndian;
    private Button southIndian;
    private Button italian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
setUpViews();
chinese.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(FoodActivity.this,ChineseActivity.class));
    }

});
northIndian.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(FoodActivity.this,NorthIndianActivity.class));

    }
});
        southIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodActivity.this,SouthIndianActivity.class));

            }
        });
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodActivity.this,ItalianActivity.class));

            }
        });
    }
    private void setUpViews()
    {
        chinese=(Button)findViewById(R.id.btn_chinese);
        northIndian=(Button)findViewById(R.id.btn_northIndain);
        southIndian=(Button)findViewById(R.id.btn_southIndian);
        italian=(Button)findViewById(R.id.btn_italian);
}
}