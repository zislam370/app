package com.rafi.fireinfo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rafi.fireinfo.R;

public class Login extends AppCompatActivity {

    EditText userEditText, passwordEditText;
    String user,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userEditText = (EditText) findViewById(R.id.editTextLoginUser);
        passwordEditText = (EditText) findViewById(R.id.editTextLoginPassword);



    }
    public void performLogin(View v) {
        user = userEditText.getText().toString();
        password = passwordEditText.getText().toString();

        if(user.equals("stationofficer") && password.equals("officer")){

            Intent checkupHome = new Intent(this,MainActivity.class);
            startActivity(checkupHome);

        }else {

            Toast.makeText(this, "Invalid User Name or Password please contract with SO Abdur Rahman", Toast.LENGTH_LONG).show();
        }

    }
}
