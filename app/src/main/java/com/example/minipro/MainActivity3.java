package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText eT1;
    private Button b7,b6;
    private EditText eT2;
    private EditText eT3;
    private EditText eT4;
    private TextView tV2;
    private TextView tV3;
    private TextView tV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b7 = findViewById(R.id.b7);
        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
        eT4 = findViewById(R.id.eT4);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        b6 = findViewById(R.id.b6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = eT1.getText().toString();
                int a = Integer.parseInt(s);
                s = eT2.getText().toString();
                int b = Integer.parseInt(s);
                s = eT3.getText().toString();
                int c = Integer.parseInt(s);
                s = eT4.getText().toString();
                int d = Integer.parseInt(s);
                float h = (a*b)+(c*d);
                int f = a+c;
                float g = h/f;
                try{

                    tV2.setText("Total cost= " + h);
                    tV3.setText("Total quantity= " + f);
                    tV4.setText("Average price per share= " + g);
                    Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_LONG).show();
                }catch (Exception e1){
                    Toast.makeText(getApplicationContext(), "Some filed is empty", Toast.LENGTH_LONG).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT1.setText("");
                eT2.setText("");
                eT3.setText("");
                eT4.setText("");
                tV4.setText("");
                tV2.setText("");
                tV3.setText("");
            }
        });
    }
//    public void cal(View v){
//        String s = eT1.getText().toString();
//        int a = Integer.parseInt(s);
////        tV4.setText(a);
//    }

}