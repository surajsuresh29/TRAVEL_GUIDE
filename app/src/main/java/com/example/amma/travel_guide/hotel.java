package com.example.amma.travel_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class hotel extends AppCompatActivity {
  public  Spinner staticSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        staticSpinner = (Spinner) findViewById(R.id.static_spinner1);
        
    }

}
