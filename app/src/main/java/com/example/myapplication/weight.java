package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity {
    private EditText input;
    private TextView output;
    private Button con;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        input = (EditText) findViewById(R.id.input_wei);
        output = (TextView) findViewById(R.id.output_wei);
        con = (Button) findViewById(R.id.con_wei);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("")) {
                    output.setText("Please enter correct input");
                    output.setTextColor(Color.RED);
                    output.setVisibility(View.VISIBLE);
                }

                double kg = Double.parseDouble(input.getText().toString());
                double g = kg * 1000;
                output.setText(Double.toString(g)+ "grams");
            }
        });
    }
}
