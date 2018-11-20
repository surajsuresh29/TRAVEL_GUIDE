package com.example.amma.travel_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookingConfirmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmed);
        TextView t1 = findViewById(R.id.txt1);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        t1.setText("HOTEL : "+b.getString("Hotel")+"\n"+"NAME : "+b.getString("Name")+"\n"+"PHONE : "+b.getString("Phone")+"\n"+"DATE : "+b.getString("Date")+"\n"+"DAYS : "+b.getString("Days"));

    }
}
