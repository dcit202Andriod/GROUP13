package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);}
    public void onClickPerInfo (View view){
        Intent intent=new Intent(this,Personal_Info.class);
        startActivity(intent);

    }


    public void onClickBHis(View view) {
        Intent intent=new Intent(this,Booking_History.class);
        startActivity(intent);
    }

    public void onClickWishList(View view) {
        Intent intent=new Intent(this,Wishlist.class);
        startActivity(intent);
    }

    public void onClickReview(View view) {
        Intent intent=new Intent(this,reviews.class);
        startActivity(intent);
    }


    public void onClickPref(View view) {
        Intent intent=new Intent(this, preferences.class);
        startActivity(intent);
    }

    public void onClickNoti(View view) {
        Intent intent=new Intent(this,Notifications.class);
        startActivity(intent);
    }
}