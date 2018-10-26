package com.example.amma.travel_guide;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class starting_page extends AppCompatActivity {

    public Spinner staticSpinner;
    public TextView txt2;
    public ImageView image;
    public Button button;
    public String place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_page);
        image = (ImageView) findViewById(R.id.iv1);
        staticSpinner = (Spinner) findViewById(R.id.static_spinner);
        txt2 = findViewById(R.id.txt2);

        staticSpinner.setOnItemSelectedListener(new ItemSelectedListener() {
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.travel,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner.setAdapter(staticAdapter);
    }

    public abstract class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        //get strings of first item
        String firstItem = String.valueOf(staticSpinner.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            if (firstItem.equals(String.valueOf(staticSpinner.getSelectedItem()))) {
                // ToDo when first item is selected
            } else {
                Toast.makeText(parent.getContext(),
                        "You have selected : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
                place = parent.getItemAtPosition(pos).toString();

                // Todo when item is selected by the user
            }

            button = (Button) findViewById(R.id.bt1);
            button.setOnClickListener(new View.OnClickListener() {


                        //changing image according to button click


                public void onClick(View arg0) {
                    if (place.equals("Trivandrum")) {

                        image.setImageResource(R.drawable.trivandrum);
                        txt2.setText("Thiruvananthapuram (or Trivandrum) is the capital of the southern Indian state of Kerala. It's distinguished by its British colonial architecture and many art galleries. It’s also home to Kuthira Malika (or Puthen Malika) Palace, adorned with carved horses and displaying collections related to the Travancore royal family, whose regional capital was here from the 18th–20th centuries.\n" +
                                "Mahatma Gandhi Road is the main boulevard, lined with art and antiques shops, carpet sellers and sari stalls. To the north, the ornate Napier Museum houses ancient Indian carvings, bronzes and natural-history specimens, while Sri Chitra Art Gallery holds miniature Indian paintings and work by lauded artist Raja Ravi Varma (1848–1906). Nearby is Thiruvananthapuram Zoo, home to Bengal tigers, Asian elephants and Indian rhinos. To the south, the giant Dravidian-style Padmanabhaswamy Temple is dedicated to Vishnu, with a 7-tier entrance tower (gopuram). Along the coast are the popular beaches of Shankumugham and Kovalam.");
                    }

                    else if(place.equals("Kollam"))
                    {

                        image.setImageResource(R.drawable.kollam);
                        txt2.setText("Kollam is a city in the state of Kerala, on India's Malabar Coast. It’s known as a trade hub and for its beaches, like lively Kollam and secluded Thirumullavaram. Sardar Vallabhbhai Patel Police Museum has artifacts tracing the history of the police force. Nearby, Ashtamudi Lake is a gateway to the Kerala backwaters, a network of waterways rich with vegetation. The striped 1902 Tangasseri Lighthouse has ocean views.");
                    }
                    else if(place.equals("Pathanamthitta"))
                    {

                        image.setImageResource(R.drawable.gavi);
                        txt2.setText("Pathanamthitta is a town and a municipality situated in the Central Travancore region in the state of Kerala, south India, spread over an area of 23.50 km². It is the administrative capital of Pathanamthitta district. The town has a population of 37,538. The Hindu pilgrim centre Sabarimala is situated in the Pathanamthitta district; as the main transport hub to Sabarimala, the town is known as the 'Pilgrim Capital of Kerala'. Pathanamthitta. District, the thirteenth revenue district of the State of Kerala. It was formed with effect from 1 November 1982 vide G.O. No.1026/82/RD dated 29 October 1982, with headquarters at Pathanamthitta. Forest covers more than half of the total area of the District. Pathanamthitta District ranks the 7th in area in the State");
                    }


                }
            });


        }

        public void onNothingSelected(AdapterView<?> arg) {

        }
    }
}

