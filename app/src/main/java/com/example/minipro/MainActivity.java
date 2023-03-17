package com.example.minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public  void pL(View v){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void sqOff(View v){
        Intent intent = new Intent(this,MainActivity8.class);
        startActivity(intent);
    }
}