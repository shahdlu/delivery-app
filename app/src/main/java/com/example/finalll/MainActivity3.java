package com.example.finalll;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
   LinearLayout layoutt,layoutt11,layoutt22,layoutt33,layoutt44,layoutt55;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        layoutt=findViewById(R.id.layout1);
        layoutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        layoutt11=findViewById(R.id.layout2);
        layoutt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        layoutt33=findViewById(R.id.layout3);
        layoutt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        layoutt44=findViewById(R.id.layout4);
        layoutt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
            layoutt55=findViewById(R.id.layout5);
         layoutt55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        layoutt22=findViewById(R.id.layout6);
        layoutt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });


    }
    public void openActivity4(){
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}
