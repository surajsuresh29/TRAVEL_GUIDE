package com.example.amma.travel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class booking extends AppCompatActivity {
    Button bc,bh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);
        bc=findViewById(R.id.car);
        bh=findViewById(R.id.hotel);


    }
    public void car_click(View view)
    {
        Intent i=new Intent(this,car.class);
        startActivity(i);
    }
    public void hotel_click(View view)
    {
        Intent i =new Intent(this,hotel1.class);
        startActivity(i);
    }

}