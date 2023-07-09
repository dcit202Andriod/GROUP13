package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_pro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pro);
    }

    public void onClickSignUp(View view) {
        Intent intent=new Intent(login_pro.this, Register_pro.class);
        startActivity(intent);
    }

    public void onClickLogin(View view) {
        Intent intent =new Intent(this, Homepage.class);
        startActivity(intent);
    }
}