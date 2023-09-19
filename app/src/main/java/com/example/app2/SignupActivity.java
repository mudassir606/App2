package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText name,email,password;
    Button signupbtn;
    TextView logintext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        logintext = findViewById(R.id.logintxt);
        signupbtn = findViewById(R.id.signupbtn);
        name = findViewById(R.id.nameEdit);
        email = findViewById(R.id.emailEdit);
        password = findViewById(R.id.passwordEdit);

        logintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(name.getText().toString().isEmpty()|email.getText().toString().isEmpty()|password.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Empty input", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
                    intent.putExtra("key", "signup");
                    startActivity(intent);
                    finish();

                }
            }
        });



    }
}