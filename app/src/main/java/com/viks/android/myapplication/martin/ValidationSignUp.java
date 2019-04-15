package com.viks.android.myapplication.martin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ValidationSignUp extends AppCompatActivity {
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation_sign_up);
        btnSignIn = findViewById(R.id.btn_signin);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(ValidationSignUp.this, MainActivity.class);
                startActivity(move);
            }
        });
    }
}
