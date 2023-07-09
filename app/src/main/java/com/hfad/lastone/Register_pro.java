package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register_pro extends AppCompatActivity {

    private String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pro);
    }

    public void onClick(View view) {
        Intent intent=new Intent(this,login_pro.class);
        EditText usernameField= (EditText) findViewById(R.id.uNameReg);

        username = usernameField.getText().toString();
        Toast.makeText(this,"Registration Successful", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}