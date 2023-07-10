package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cWeath_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cweath_des);
    }

    public void onClickProceed(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        intent.putExtra("c",1);
        startActivity(intent);

    }

    public void cwBack(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}
