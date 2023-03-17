package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void profit(View v){
        Intent intent = new Intent(this,MainActivity6.class);
        startActivity(intent);
    }
    public void loss(View v){
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);
    }
}