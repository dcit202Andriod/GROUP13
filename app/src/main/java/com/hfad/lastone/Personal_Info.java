package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Personal_Info extends AppCompatActivity {

    private String fName;
    private String email;
    private String lName;
    private String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Personal_Info obj=new Personal_Info();
    }


    public void onclickSave(View view) {
        EditText firstName_up=findViewById(R.id.fnameUserProfile);
        fName=firstName_up.getText().toString();

        EditText lastName_up=findViewById(R.id.lnameUserProfile);
        lName=String.valueOf(lastName_up.getText());

        EditText email_up=findViewById(R.id.emailUserProfile);
        email=email_up.getText().toString();

        EditText phone_up=findViewById(R.id.phoneUserProfile);
        phone=phone_up.getText().toString();
        Intent intent=new Intent(this,UserProfileActivity.class);
        startActivity(intent);
    }
}