package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasketBall extends AppCompatActivity {
    private static double basketball_amt=0;
    private Button basketball_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball);
basketball_book=(Button)findViewById(R.id.btn_basketballbook);
basketball_book.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        basketball_amt=basketball_amt+300;
        startActivity(new Intent(BasketBall.this,FinalActivity.class));

    }
});

    }
    public static double getBasketball_amt()
    {
        return basketball_amt;
    }
}
