package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class vikings_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vikings_des);
    }

    public void onClickProceed(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        intent.putExtra("c",2);
        booking_summary.hallOREs="Vikings Hostel";

        RadioGroup radioGroup = findViewById(R.id.radioGroupV);
        RadioButton checked=findViewById(radioGroup.getCheckedRadioButtonId());
        booking_summary.roomsel=checked.getText().toString();

        startActivity(intent);

    }

    public void vikBack(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }


}