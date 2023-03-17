package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private TextView tv1;
    private TextView tv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button b11 = findViewById(R.id.b11);
        Button b10 = findViewById(R.id.b10);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int a = Integer.parseInt(s);
                s = et2.getText().toString();
                int b = Integer.parseInt(s);
                s = et3.getText().toString();
                int c = Integer.parseInt(s);
                s = et4.getText().toString();
                int d = Integer.parseInt(s);
                s = et5.getText().toString();
                int e = Integer.parseInt(s);
                int f = ((c-a)*b)-(d+e);
                int g = c*b;
                if(f>=0){
                    tv1.setText("Profit= " + f);
                    tv2.setText("Total cost= " + g);
                    Toast.makeText(MainActivity6.this, "Your in profit", Toast.LENGTH_SHORT).show();
                }
                else{
                    tv1.setText("Your are in loss of= " + f*(-1));
                    tv2.setText("Total cost= " + g);
                    Toast.makeText(MainActivity6.this, "Your in loss", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                tv1.setText("");
                tv2.setText("");
            }
        });
    }
}