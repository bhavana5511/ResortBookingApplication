package com.example.javaproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class DetailsActivity extends AppCompatActivity {
    private Button confirm;
    private FirebaseAuth firebaseAuth;
    private EditText userName,userNumber,userEmail,userPassword, usernn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setUpView();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate())
                startActivity(new Intent(DetailsActivity.this, SecondActivity.class));
            }
        });
    }

    private void setUpView()
    {
        confirm=(Button)findViewById(R.id.btn_details);
        userName=(EditText)findViewById(R.id.et_name);
        userNumber=(EditText)findViewById(R.id.editText2);
        userEmail=(EditText)findViewById(R.id.et_email);
        userPassword=(EditText)findViewById(R.id.et_password);


    }
    private Boolean validate(){
        Boolean result = false;

        String name = userName.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();
        String number = userNumber.getText().toString();


        if(name.isEmpty() || password.isEmpty() || email.isEmpty() || number.isEmpty() ){
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        }else{
            result = true;
        }

        return result;
    }
}
