package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FunActivity extends AppCompatActivity {
    private Button indoor;
    private Button outdoor;
    private Button  adventure;
    private Button disco;
    private Button guhantara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);
        setUPViews();
        indoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this,IndoorActivity.class));
            }
        });
        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this,OutdoorActivity.class));
            }
        });
        adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this,AdventureActivity.class));

            }
        });
        disco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this,DiscoActivity.class));

            }
        });
        guhantara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this,GuhantaraActivity.class));

            }
        });
    }
    private void setUPViews()
    {
        indoor=(Button)findViewById(R.id.btn_indoor);
        outdoor=(Button)findViewById(R.id.btn_outdoor);
        adventure=(Button)findViewById(R.id.btn_adventure);
        disco=(Button)findViewById(R.id.btn_disco);
        guhantara=(Button)findViewById(R.id.btn_guhantara);
    }
}
