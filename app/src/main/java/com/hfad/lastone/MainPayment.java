package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPayment extends AppCompatActivity {
    private Button mmoney,credit_card,online_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_payment);
        mmoney = findViewById(R.id.Mmoney);
        mmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainPayment.this,m_money.class);
                startActivity(intent);
            }
        });

        credit_card = findViewById(R.id.Credit_Card);
        credit_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainPayment.this,Credit_Card.class);
                startActivity(intent);
            }
        });

        online_payment = findViewById(R.id.Online_Payment);
        online_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainPayment.this,Online_Pay.class);
                startActivity(intent);
            }
        });
    }
}