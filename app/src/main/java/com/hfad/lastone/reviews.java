package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class reviews extends AppCompatActivity {

    private final String EMAIL_ADDRESS = "kmanderson@st.ug.edu.gh";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);


    }

    public void onClickSendrev(View view) {
        EditText review = (EditText) findViewById(R.id.reviewEditText);
        String EMAIL_BODY = review.getText().toString();
        Spinner reviewSpinner=findViewById(R.id.spinner);
        String EMAIL_SUBJECT = reviewSpinner.getSelectedItem().toString();

        sendEmail(EMAIL_SUBJECT, EMAIL_BODY);

    }


    private void sendEmail(String subject, String body) {


        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + "kmanderson@st.ug.edu.gh"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);

        PackageManager packageManager = getPackageManager();
        if (emailIntent.resolveActivity(packageManager) != null) {
            startActivity(emailIntent);
        } else {
            Toast.makeText(this, "No email app found.", Toast.LENGTH_SHORT).show();
        }
    }
}
