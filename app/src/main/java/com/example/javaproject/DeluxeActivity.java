package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeluxeActivity extends AppCompatActivity {
    private Button Dbook;
    public static double deluxe_amt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deluxe);
        setUpView();
        Dbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeluxeActivity.this,FinalActivity.class));
                deluxe_amt=deluxe_amt+4499;
            }
        });
    }
    private void setUpView()
    {
        Dbook=(Button)findViewById(R.id.btn_deluxe);
    }
    public static double getDeluxe_amt_amt()
    {
        return deluxe_amt;
    }
}
