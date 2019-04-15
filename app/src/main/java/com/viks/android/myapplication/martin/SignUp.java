package com.viks.android.myapplication.martin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    Button btnSignUpFacebook, btnSignUp;
    TextView tvSignIn, tvValidation;

    private void component(){
        btnSignUpFacebook = findViewById(R.id.btn_signupfb);
        btnSignUp = findViewById(R.id.btn_sigup);
        tvSignIn = findViewById(R.id.tv_signin);
        tvValidation = findViewById(R.id.tv_validationsignup);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        component();
        tvValidation.setText("");

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validationSignUP();
            }
        });

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }

    private void validationSignUP(){
        Intent move = new Intent(SignUp.this, ValidationSignUp.class);
        startActivity(move);
    }

    private void signIn(){
        Intent move = new Intent(SignUp.this, MainActivity.class);
        startActivity(move);
    }
}
