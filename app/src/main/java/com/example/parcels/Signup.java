package com.example.parcels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void gotologinpagefromsignup(View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
