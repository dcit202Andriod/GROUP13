package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen1001);
    }

    public void vik_OnClick(View view) {
        Intent intentVik =new Intent(this, vikings_des.class);
        startActivity(intentVik);
    }

    public void onCWealth(View view) {
        Intent intentVik =new Intent(this, cWeath_des.class);
        startActivity(intentVik);
    }

    public void onClickPent(View view) {
        Intent intentVik =new Intent(this, pent_des.class);
        startActivity(intentVik);
    }
}