package com.example.samriyeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.common.api.internal.RegisterListenerMethod;

public class Login extends AppCompatActivity {

    Button LOGIN;
    Button NewUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        LOGIN  = findViewById(R.id.sign_in);
        NewUser = findViewById(R.id.NewUser);

        NewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,SingUp.class);
                startActivity(intent);
            }
        });



        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent intent = new Intent(Login.this,Home.class);
           startActivity(intent);
            }
        });



    }
}