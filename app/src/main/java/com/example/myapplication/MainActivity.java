package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button len;
    private Button wei;
    private Button tim;
    private Button tem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        len = (Button) findViewById(R.id.lenid);
        wei = (Button) findViewById(R.id.weiid);
        tim = (Button) findViewById(R.id.timid);
        tem = (Button) findViewById(R.id.temid);

        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, length.class);
                startActivity(intent);
            }
        });

        wei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, weight.class);
                startActivity(intent);
            }
        });

        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, time.class);
                startActivity(intent);
            }
        });

        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, temp.class);
                startActivity(intent);
            }
        });
    }
}