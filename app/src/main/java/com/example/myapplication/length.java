package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class length extends AppCompatActivity {
    private TextView output;
    private EditText input;
    private Button con;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        input = (EditText) findViewById(R.id.input_len);
        output = (TextView) findViewById(R.id.output_len);
        con = (Button) findViewById(R.id.con_len);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("")) {
                    output.setText("Please enter correct input");
                    output.setTextColor(Color.RED);
                    output.setVisibility(View.VISIBLE);
                }

                double km = Double.parseDouble(input.getText().toString());
                double m = km * 1000;
                output.setText(Double.toString(m)+ "meters");
            }
        });
    }
}
