package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginbtn;
    TextView textbtn;
    EditText email,password;
     String emilf = "admin@gmail.com";
     String pswdf = "123456";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = findViewById(R.id.loginbtn);
        textbtn = findViewById(R.id.logintxt);
        email = findViewById(R.id.editEmail);
        password = findViewById(R.id.editPassword);

        textbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().isEmpty()|password.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Empty input", Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().equals(emilf)&&password.getText().toString().equals(pswdf)){
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    intent.putExtra("key", "login");
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid input", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}