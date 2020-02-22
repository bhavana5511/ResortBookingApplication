package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegularActivity extends AppCompatActivity {
    private Button Rbook;
    public static double regular_amt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);
        setUpView();
        Rbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regular_amt=regular_amt+1499;
                startActivity(new Intent(RegularActivity.this,FinalActivity.class));
            }
        });
    }
    private void setUpView()
    {
        Rbook=(Button)findViewById(R.id.btn_regular);
    }


    public static double getRegular_amt()
    {
        return regular_amt;
    }

}
