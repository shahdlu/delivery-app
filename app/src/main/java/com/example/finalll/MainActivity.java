package com.example.finalll;
import static android.widget.Toast.LENGTH_LONG;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button SingnUp;
    private Button Signin;
    EditText username,password;
    DB obj=new DB(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getSupportActionBar().hide();

        username= (EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        SingnUp=(Button) findViewById(R.id.btn_Register);
        Signin=(Button) findViewById(R.id.Btn_login);


         //Boolean s=obj.insert("Yasmin","1234");
         //Toast.makeText(this,s,Toast.LENGTH_LONG).show();
        //String s="required fields";

        //buton1=findViewById(R.id.btn_login);
        //buton2=findViewById(R.id.registerBtn);
        SingnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(MainActivity.this, "Required fields", Toast.LENGTH_SHORT).show();
                }
                else {
                      Boolean insertion=obj.insert(user,pass);
                      Toast.makeText(MainActivity.this, "Registred successfully", Toast.LENGTH_SHORT).show();
                      Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                      startActivity(intent);

                }
            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   String userr = username.getText().toString();
                   String passs = password.getText().toString();
                if (TextUtils.isEmpty(userr) || TextUtils.isEmpty(passs)) {
                    Toast.makeText(MainActivity.this, "Required fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean insertion = obj.insert(userr, passs);
                    if (insertion) {
                        Toast.makeText(MainActivity.this, "Logined successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }
    }

                /*else
                {
                    Boolean result= Boolean.valueOf(obj.insert(user,pass));
                    if(result){
                        Toast.makeText(MainActivity.this, "U R welcomed", Toast.LENGTH_SHORT).show();
                        openActivity1();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Please Register", Toast.LENGTH_SHORT).show();
                    }*/




         /*   }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });
    }
    public void openActivity1(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openRegister(){
        Intent intent=new Intent(this,Register.class);
        startActivity(intent);
    }*/

