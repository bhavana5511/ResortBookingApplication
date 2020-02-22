package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuiteActivity extends AppCompatActivity {
    private Button Sbook;
    private static double suite_amt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suite);
        setUpView();
        Sbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suite_amt=suite_amt+7999;
                startActivity(new Intent(SuiteActivity.this,FinalActivity.class));
            }
        });
    }
    private void setUpView()
    {
        Sbook=(Button)findViewById(R.id.btn_suite);
    }
    public static double getSuite_amt()
    {
        return suite_amt;
    }
}
