package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Element;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView value;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        value = findViewById(R.id.data);


        Intent intent = getIntent();
        String data = intent.getStringExtra("key");

        if(data.equals("login")){
            value.setText("Welcome Back");
        } else if (data.equals("signup") ){
            value.setText("Account is Created");
        }

    }
}