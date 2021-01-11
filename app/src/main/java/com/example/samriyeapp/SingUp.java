package com.example.samriyeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SingUp extends AppCompatActivity {

    TextInputLayout regName, regStudenID, regEmail, regPhoneNo,regPassword;
    Button Register, LogIN, LoginHere;


    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

       regName = findViewById(R.id.register_name);
       regStudenID = findViewById(R.id.StudentID);
       regEmail = findViewById(R.id.Email);
       regPhoneNo = findViewById(R.id.PhoneNO);
       regPassword = findViewById(R.id.password);

       Register = findViewById(R.id.register_button);
       LogIN  = findViewById(R.id.sign_in);
       LoginHere = findViewById(R.id.LoginHere);

       Register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               rootNode = FirebaseDatabase.getInstance();
               reference = rootNode.getReference("Users");


               UserHelping  userHelping= new UserHelping();
               String name = regName.getEditText().getText().toString();
               String StudentID =regStudenID.getEditText().getText().toString();
               String Email = regEmail.getEditText().getText().toString();
               String PhoneNo = regPhoneNo.getEditText().getText().toString();
               String password = regPassword.getEditText().getText().toString();

               UserHelping helping = new UserHelping(name,StudentID,Email,PhoneNo,password);

               reference.child(StudentID).setValue(helping);

           }
       });

        }



        
    }
