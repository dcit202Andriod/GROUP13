package com.hfad.lastone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class booking_summary extends Activity {

    public static String hallOREs;
    public static String roomsel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingsummary);
        TextView hallOResidence=findViewById(R.id.book_summ_ho_res);
        TextView roomselec=findViewById(R.id.roomSelec);
        TextView dateAdmit=findViewById(R.id.admiss_date);
        hallOResidence.setText(hallOREs);
roomselec.setText(roomsel);

        Calendar currentDate = Datenow.getCurrentDate();
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1; // Month starts from 0
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        String date="Current date: " + year + "-" + month + "-" + day;
    dateAdmit.setText(date);}

    public void bSumConfirm(View view) {
        Intent intent =new Intent(this, booking_confirmation.class);
        startActivity(intent);

    }
}
