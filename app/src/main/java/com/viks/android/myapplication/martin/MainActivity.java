package com.viks.android.myapplication.martin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSignInFacebook, btnSignIn;
    EditText etUsername, etPassword;
    TextView tvForgot, tvCreateAccount, tvIncorrect;


    private void component(){
        btnSignInFacebook = findViewById(R.id.btn_lohinfb);
        btnSignIn = findViewById(R.id.btn_signin);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        tvForgot = findViewById(R.id.tv_fotgotpassword);
        tvCreateAccount = findViewById(R.id.tv_createaccount);
        tvIncorrect = findViewById(R.id.tv_incorrectpass);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        component();
        tvIncorrect.setText("");

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        tvForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgot();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    private void signUp(){
        Intent move = new Intent(MainActivity.this, SignUp.class);
        startActivity(move);
    }

    private void signIn(){
        setContentView(R.layout.succes);
    }

    private void forgot(){
        setContentView(R.layout.forgot);
    }
}
