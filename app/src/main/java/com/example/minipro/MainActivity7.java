package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    private EditText et6;
    private EditText et7;
    private EditText et8;
    private EditText et9;
    private EditText et10;
    private Button b12;
    private Button b13;
    private TextView tv3;
    private TextView tv4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b13 = findViewById(R.id.b13);
        b12 = findViewById(R.id.b12);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        et9 = findViewById(R.id.et9);
        et10 = findViewById(R.id.et10);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et6.getText().toString();
                int a = Integer.parseInt(s);
                s = et7.getText().toString();
                int b = Integer.parseInt(s);
                s = et8.getText().toString();
                int c = Integer.parseInt(s);
                s = et9.getText().toString();
                int d = Integer.parseInt(s);
                s = et10.getText().toString();
                int e = Integer.parseInt(s);
                int f = ((a-c)*b)-(d+e);
                int g = c*b;
                if(f>0){
                    tv3.setText("Loss= " + f);
                    tv4.setText("Total cost= " + g);
                    Toast.makeText(MainActivity7.this, "Your in Loss", Toast.LENGTH_SHORT).show();
                }
                else{
                    tv3.setText("Your in profit= " + f*(-1));
                    tv4.setText("Total cost= " + g);
                    Toast.makeText(MainActivity7.this, "Your in Profit", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et6.setText("");
                et7.setText("");
                et8.setText("");
                et9.setText("");
                et10.setText("");

                tv3.setText("");
                tv4.setText("");
            }
        });
    }
}