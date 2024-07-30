package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temp extends AppCompatActivity {

    private EditText input;
    private TextView output;
    private Button con;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        input = (EditText) findViewById(R.id.input_tem);
        output = (TextView) findViewById(R.id.output_tem);
        con = (Button) findViewById(R.id.con_tem);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("")) {
                    output.setText("Please enter correct input");
                    output.setTextColor(Color.RED);
                    output.setVisibility(View.VISIBLE);
                }

                double far = Double.parseDouble(input.getText().toString());
                double cel = (far - 32) * 5/9;
                output.setText(Double.toString(cel)+ "celsius");
            }
        });
    }
}



