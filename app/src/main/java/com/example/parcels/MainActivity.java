package com.example.parcels;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.parcels.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText e =(EditText)findViewById(R.id.userid);
        String message = e.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        this.startActivity(intent);
    }
    public void gotoSignupFromLogin(View view){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
}
