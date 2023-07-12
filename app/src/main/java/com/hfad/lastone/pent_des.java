package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class pent_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pent_des);
    }

    public void onClickProceed(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        intent.putExtra("c",3);
        booking_summary.hallOREs="Pentagon Hostel";

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton checked=findViewById(radioGroup.getCheckedRadioButtonId());
        booking_summary.roomsel=checked.getText().toString();

        startActivity(intent);

    }

    public void pentBack(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}