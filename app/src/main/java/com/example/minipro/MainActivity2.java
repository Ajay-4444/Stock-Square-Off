package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void singleStock(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void multiStock(View v){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}