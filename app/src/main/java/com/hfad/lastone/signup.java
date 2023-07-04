package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    TextView txtSignIn = findViewById(R.id.txtSignIn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /* Intent intent = new Intent(SignUpActivity.this,LoginActivity2.class);
                startActivity(intent);
                finish();*/
            }
        });

    }
}