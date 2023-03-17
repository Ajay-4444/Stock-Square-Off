package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    private EditText et11;
    private EditText et12;
    private EditText et13;
    private EditText et14;
    private Button b14;
    private Button b15;
    private TextView tv5;
    private TextView tv6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        et11 = findViewById(R.id.et11);
        et12 = findViewById(R.id.et12);
        et13 = findViewById(R.id.et13);
        et14 = findViewById(R.id.et14);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et11.getText().toString();
                int a = Integer.parseInt(s);
                s = et12.getText().toString();
                int b = Integer.parseInt(s);
                s = et13.getText().toString();
                int c = Integer.parseInt(s);
                s = et14.getText().toString();
                int d = Integer.parseInt(s);
                float e = (a-c)*b;
                float f = d-c;
                float g = e/f;
                int h = (int) (g*c);
                tv5.setText("Shares required to purchase= " + g);
                tv6.setText("Amount required to purchase= " + h);

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et11.setText("");
                et12.setText("");
                et13.setText("");
                et14.setText("");
                tv5.setText("");
                tv6.setText("");
            }
        });
    }
}