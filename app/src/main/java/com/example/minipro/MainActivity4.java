package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private EditText eT5;
    private EditText eT6;
    private EditText eT7;
    private EditText eT8;
    private EditText eT9;
    private EditText eT10;
    private EditText eT11;
    private EditText eT12;
    private EditText eT13;
    private EditText eT14;
    private TextView tV13;
    private TextView tV14;
    private TextView tV15;
    private Button b9,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        eT5 = findViewById(R.id.eT5);
        eT6 = findViewById(R.id.eT6);
        eT7 = findViewById(R.id.eT7);
        eT8 = findViewById(R.id.eT8);
        eT9 = findViewById(R.id.eT9);
        eT10 = findViewById(R.id.eT10);
        eT11 = findViewById(R.id.eT11);
        eT12 = findViewById(R.id.eT12);
        eT13 = findViewById(R.id.eT13);
        eT14 = findViewById(R.id.eT14);
        tV13 = findViewById(R.id.tV13);
        tV14 = findViewById(R.id.tV14);
        tV15 = findViewById(R.id.tV15);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = eT5.getText().toString();
                int a = Integer.parseInt(s);
                s = eT6.getText().toString();
                int b = Integer.parseInt(s);
                s = eT7.getText().toString();
                int c = Integer.parseInt(s);
                s = eT8.getText().toString();
                int d = Integer.parseInt(s);
                s = eT9.getText().toString();
                int e = Integer.parseInt(s);
                s = eT10.getText().toString();
                int f = Integer.parseInt(s);
                s = eT11.getText().toString();
                int g = Integer.parseInt(s);
                s = eT12.getText().toString();
                int h = Integer.parseInt(s);
                s = eT13.getText().toString();
                int i = Integer.parseInt(s);
                s = eT14.getText().toString();
                int j = Integer.parseInt(s);
                float k = (a*b)+(c*d)+(e*f)+(g*h)+(i*j);
                int l = a + c + e + g + i;
                float m = k/l;
                tV13.setText("Total cost= " + k);
                tV14.setText("Total quantity= " + l);
                tV15.setText("Average price per share= " + m);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT6.setText("");
                eT7.setText("");
                eT8.setText("");
                eT9.setText("");
                eT10.setText("");
                eT11.setText("");
                eT12.setText("");
                eT13.setText("");
                eT14.setText("");
                tV13.setText("");
                tV14.setText("");
                tV15.setText("");
            }
        });
    }

}