package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class time extends AppCompatActivity {

    private EditText input;
    private TextView output;
    private Button con;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        input = (EditText) findViewById(R.id.input_tim);
        output = (TextView) findViewById(R.id.output_tim);
        con = (Button) findViewById(R.id.con_tim);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("")) {
                    output.setText("Please enter correct input");
                    output.setTextColor(Color.RED);
                    output.setVisibility(View.VISIBLE);
                }

                double h = Double.parseDouble(input.getText().toString());
                double min = h * 60;
                output.setText(Double.toString(min)+ "minutes");
            }
        });
    }
}
