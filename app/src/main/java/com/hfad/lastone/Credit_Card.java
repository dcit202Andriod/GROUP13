package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Credit_Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
    }

    public void ccBack(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        startActivity(intent);
    }

    public void OnClick_CC_proceed(View view) {
        Intent intent =new Intent(this,booking_summary.class);
        startActivity(intent);
    }
}