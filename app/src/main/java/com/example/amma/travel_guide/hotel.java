package com.example.amma.travel_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class hotel extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public  Spinner staticSpinner;
    String ACtype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        staticSpinner = (Spinner) findViewById(R.id.static_spinner1);
        staticSpinner.setPrompt("SELECT_TYPE");
        staticSpinner.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add("ACCOUNT--TYPE");
        categories.add("Google");
        categories.add("Facebook");
        categories.add("Instagram");
        categories.add("LinkedIn");
        categories.add("Twitter");
        categories.add("SHOW ALL");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        staticSpinner.setAdapter(dataAdapter);
        
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ACtype = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
