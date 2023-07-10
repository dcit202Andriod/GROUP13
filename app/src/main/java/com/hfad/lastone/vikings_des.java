package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vikings_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vikings_des);
    }

    public void onClickProceed(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        startActivity(intent);

    }
}