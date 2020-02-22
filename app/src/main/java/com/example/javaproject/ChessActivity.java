package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChessActivity extends AppCompatActivity {
    private static double chess_amt;
    private Button chess_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        chess_book=(Button)findViewById(R.id.btn_chessbook);
        chess_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chess_amt=chess_amt+100;
                startActivity(new Intent(ChessActivity.this,FinalActivity.class));
            }
        });
    }
    public static double getChess_amt()
    {
        return chess_amt;
    }


}
