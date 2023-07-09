package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HotelListings extends AppCompatActivity {
    String[] hostellist = {"Vikings", "My House","Mensah Sabah", "Valco", "Liman", "Pent", "Volta"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_listings);
        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Use the built-in layout for each item
                hostellist
        );
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Log a message when an item is clicked
                Log.i("LIST_VIEW", "Item is clicked at position " + position);
            }
        });
    }
}

