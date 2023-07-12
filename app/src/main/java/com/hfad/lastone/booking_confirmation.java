package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class booking_confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        Toast.makeText(this,"Booking Successful", Toast.LENGTH_SHORT).show();

    }
    public void onClickHome(View view){
        Intent intent= new Intent(this,Homepage.class);
        startActivity(intent);

    }
}