package com.example.finalll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button Signin;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        username= (EditText) findViewById(R.id.et_username);
        password=(EditText) findViewById(R.id.et_password);
        Signin=(Button) findViewById(R.id.btn_loginn);
        DB db=new DB(this);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(login.this, "Required fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean checker=db.CheckUserPass(user,pass);
                    if(checker){
                        Toast.makeText(login.this, "Logined", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(login.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}