package com.example.amma.travel_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class hotel1 extends AppCompatActivity {
    EditText ed1;
    public Spinner staticSpinner;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    String place;
    public Button button;
    Button b1, b2, b3, b4, b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        ed1 = findViewById(R.id.dis);
        t1 = findViewById(R.id.text2);
        t2 = findViewById(R.id.hotel1);
        t3 = findViewById(R.id.add1);
        t4 = findViewById(R.id.hotel2);
        t5 = findViewById(R.id.add2);
        t6 = findViewById(R.id.hotel3);
        t7 = findViewById(R.id.add3);
        t8 = findViewById(R.id.hotel4);
        t9 = findViewById(R.id.add4);
        t10 = findViewById(R.id.hotel5);
        t11 = findViewById(R.id.add5);
        staticSpinner = (Spinner) findViewById(R.id.static_spinner);

        staticSpinner.setOnItemSelectedListener(new hotel1.ItemSelectedListener() {
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

            button = (Button) findViewById(R.id.select);
            button.setOnClickListener(new View.OnClickListener() {


                //changing image according to button click


                public void onClick(View arg0) {


                    if (place.equals("Trivandrum")) {
                        t1.setText("Hotels in Trivandrum are:");
                        t2.setText("APPOLO DIMORA ");
                        t3.setText("Opp. Central Railway Station,\n Thampanoor, Thiruvananthapuram,\n Kerala ");
                        t4.setText("CLASSIC SAROVAR PORTICO");
                        t5.setText("Manjalikulam Rd, Santhi Nagar, Thampanoor, Thiruvananthapuram, Kerala 695001");

                        t6.setText("SP GRAND DAYS");
                        t7.setText("Near New Flyover, Panavila Junction, Thycaud, Thiruvananthapuram, Kerala 695014");

                        t8.setText("BIVERAH HOTEL AND SUITES");
                        t9.setText("Kumarapuram-Pattom Road, Medical College P.O., Thiruvananthapuram, Kerala 695011");

                        t10.setText("HOTEL PRATHIBA HERITAGE");
                        t11.setText("Dharmalayam Road, Opposite Ayurveda College, M.G. Road, Ayurveda College, M.G. Road, Thiruvananthapuram");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Kollam")) {
                        t1.setText("Hotels in Kollam are:");

                        t2.setText("SEA PEARL");
                        t3.setText("NTV Nagar, Kadapakkada, Kollam, Kerala 691008• ");

                        t4.setText("GURUPRASAD");
                        t5.setText("Main Rd, Chinnakada, Kollam, Kerala 691001");

                        t6.setText("VAIDYA HOTEL");
                        t7.setText("Residency Rd, Chamkkada, Kollam, Kerala 691001");

                        t8.setText("REGANT LAKE PALACE");
                        t9.setText("Opp. Foundation Hospital Jn Puthenthura P.O., Neendakara, Kollam, Kerala 691582");

                        t10.setText("SHAH INTERNATIONAL");
                        t11.setText("Residency Rd, Next to Axis Bank ATM, Chinnakada, Kollam, Kerala 691001");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);

                    } else if (place.equals("Pathanamthitta")) {
                        t1.setText("Hotels in Pathanamthitta are:");

                        t2.setText("HILLS PARK ");
                        t3.setText("Kumbazha, Thiruvalla-kumbazha highway, Pathanamthitta, Kerala 689645•099473 99222 ");

                        t4.setText("SHANTHI");
                        t5.setText("Tk road central junction pathanamthitta, Pathanamthitta, Kerala 689645");

                        t6.setText("PARTHASARATHY");
                        t7.setText("Bus Station, Near KSRTC, Pathanamthitta, Kerala 689645");

                        t8.setText("HEY DAY");
                        t9.setText("Bus Station, Near KSRTC, Pathanamthitta, Kerala 689645");

                        t10.setText("PEARL");
                        t11.setText("Thiruvalla-Kumbazha Hwy, Mylapra, Pathanamthitta, Kerala 689645");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);

                    } else if (place.equals("Alappey")) {
                        t1.setText("Hotels in Alappuzha are:");

                        t2.setText("CASAMARIA BEACH");
                        t3.setText("Near Alleppey Railway Station, Beach Road, Alappuzha, Kerala 688012 ");

                        t4.setText("ALAPPEY PRINCE");
                        t5.setText("A.S Road, N.H.47, Near Kalappura Junction, Alappuzha, Kerala 688007");

                        t6.setText("RAMADA");
                        t7.setText("Nehru Trophy Boat Race Finishing Point Stadium, Finishing Point Road, Punnamada, Finishing Point, Alappuzha, Kerala 688013");

                        t8.setText("LAKE PALACE");
                        t9.setText("Thirumala Ward, Chungam, Alappuzha, Kerala 688011");

                        t10.setText("CITRUS HOTELS");
                        t11.setText("8/504 A-504N, Karimba Valavu, Punnapura, Paravoor Village, Pallathuruthy, Pallathurut, Alappuzha, 688009");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);


                    } else if (place.equals("Kottayam")) {
                        t1.setText("Hotels in Kottayam are:");

                        t2.setText("AIDA");
                        t3.setText("Aida Junction, SH 1, Kottayam, Kerala 686001");

                        t4.setText("ORCHID");
                        t5.setText("Boat Jetty Road, Near SBI Bank, Pulimoodu Junction, Kottayam, Kerala 686001");

                        t6.setText("PUTHENS CLIFTON ");
                        t7.setText("Railway Station Rd, Nagampadam, Kottayam, Kerala 686002");

                        t8.setText("DAY SPRINGS");
                        t9.setText("Old, Boat Jetty Rd, Opposite Municipal Guest House, Puthenangady, Kottayam, Kerala 686001");

                        t10.setText("ANJALY PARK");
                        t11.setText("K.K Road, Kottayam, Kerala 686001");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Idukki")) {
                        t1.setText("Hotels in Idukki are:");

                        t2.setText("GOKULAM ORCHID HIGHLANDS");
                        t3.setText("Chithirapuram South Power House Road, Munnar, Kerala 685565");

                        t4.setText("PERIYAR MEADOWS");
                        t5.setText("Thekkady Road, Kumily, Kerala 685509");

                        t6.setText("ABAD COPPER CASTLE ");
                        t7.setText("Pothumedu, Idukki, Munnar, Kerala 685612");

                        t8.setText("HOLIDAY VISTA");
                        t9.setText("KK Road, Thekkady, Idukki, Kumily, 685509");

                        t10.setText("CLOUDS VALLEY");
                        t11.setText("Kannan Devan Hills, Munnar, Kerala 685612");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Ernakulam")) {
                        t1.setText("Hotels in Ernakulam are:");

                        t2.setText("DUNES");
                        t3.setText("Doraiswamy Iyer Rd, Shenoys, Kochi, Kerala 682035");

                        t4.setText("THE INTERNATIONAL HOTEL");
                        t5.setText("Opposite Chennai Silks, Veekshanam road, Mahatma Gandhi Rd, Kacheripady, Ernakulam, Kerala 682035");

                        t6.setText("ABAD PLAZA");
                        t7.setText("Mahatma Gandhi Rd, Shenoys, Kochi, Kerala 682035");

                        t8.setText("GOKULAM PARK");
                        t9.setText("Muthoottu Mini Financiers, Banerji Rd, Opposite, Kaloor, Kochi, Kerala 682017");

                        t10.setText("THE RENAI COCHIN");
                        t11.setText("Palarivattom - Edappally Rd, Sonia Nagar, Palarivattom, Kochi, Kerala 682025");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Thrissur")) {
                        t1.setText("Hotels in Thrissur are:");
                        t2.setText("APPOLO DIMORA ");
                        t3.setText("Opp. Central Railway Station,\n Kerala ");
                        t4.setText("CLASSIC SAROVAR PORTICO");
                        t5.setText("Manjalikulam Rd, Santhi Nagar, Kerala");

                        t6.setText("SP GRAND DAYS");
                        t7.setText("Near New Flyover, Panavila Junction, Kerala 695014");

                        t8.setText("BIVERAH HOTEL AND SUITES");
                        t9.setText("Kumarapuram-Pattom Road, Medical College P.O, Kerala 695011");

                        t10.setText("HOTEL PRATHIBA HERITAGE");
                        t11.setText("Dharmalayam Road, Opposite Ayurveda College, M.G. Road, Ayurveda College, M.G. Road");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Palakkad")) {
                        t1.setText("Hotels in Palakkad are:");

                        t2.setText("SEA PEARL");
                        t3.setText("NTV Nagar, Kerala 691008• ");

                        t4.setText("GURUPRASAD");
                        t5.setText("Main Rd, , Palakkad, Kerala 691001");

                        t6.setText("VAIDYA HOTEL");
                        t7.setText("Residency Rd, Palakkad, Kerala 691001");

                        t8.setText("REGANT LAKE PALACE");
                        t9.setText("Opp. Foundation Hospital Jn Puthenthura P.O., Palakkad, Kerala 691582");

                        t10.setText("SHAH INTERNATIONAL");
                        t11.setText("Residency Rd, Next to Axis Bank ATM, Palakkad, Kerala 691001");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);

                    } else if (place.equals("Malappuram")) {
                        t1.setText("Hotels in Malappuram are:");

                        t2.setText("HILLS PARK ");
                        t3.setText("Kumbazha, Thiruvalla-kumbazha highway,Malappuram, Kerala 689645•099473 99222 ");

                        t4.setText("SHANTHI");
                        t5.setText("Tk road central junction Malappuram, Kerala 689645");

                        t6.setText("PARTHASARATHY");
                        t7.setText("Bus Station, Near KSRTC, Malappuram, Kerala 689645");

                        t8.setText("HEY DAY");
                        t9.setText("Bus Station, Near KSRTC,Malappuram, Kerala 689645");

                        t10.setText("PEARL");
                        t11.setText("Thiruvalla-Kumbazha Hwy, Mylapra, Malappuram, Kerala 689645");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);

                    } else if (place.equals("Calicut")) {
                        t1.setText("Hotels in Calicut are:");

                        t2.setText("CASAMARIA BEACH");
                        t3.setText("Near Alleppey Railway Station, Beach Road, Calicut, Kerala 688012 ");

                        t4.setText("ALAPPEY PRINCE");
                        t5.setText("A.S Road, N.H.47, Near Kalappura Junction,Calicut, Kerala 688007");

                        t6.setText("RAMADA");
                        t7.setText("Nehru Trophy Boat Race Finishing Point Stadium, Finishing Point Road, Punnamada, Finishing Point, Calicut, Kerala 688013");

                        t8.setText("LAKE PALACE");
                        t9.setText("Thirumala Ward, Chungam, Calicut, Kerala 688011");

                        t10.setText("CITRUS HOTELS");
                        t11.setText("8/504 A-504N, Karimba Valavu, Punnapura, Paravoor Village, Pallathuruthy, Pallathurut, Calicut, 688009");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);


                    } else if (place.equals("Wayanad")) {
                        t1.setText("Hotels in Wayanad are:");

                        t2.setText("AIDA");
                        t3.setText("Aida Junction, SH 1, Wayanad, Kerala 686001");

                        t4.setText("ORCHID");
                        t5.setText("Boat Jetty Road, Near SBI Bank, Pulimoodu Junction, Wayanad, Kerala 686001");

                        t6.setText("PUTHENS CLIFTON ");
                        t7.setText("Railway Station Rd, Nagampadam, Wayanad, Kerala 686002");

                        t8.setText("DAY SPRINGS");
                        t9.setText("Old, Boat Jetty Rd, Opposite Municipal Guest House, Puthenangady, Wayanad, Kerala 686001");

                        t10.setText("ANJALY PARK");
                        t11.setText("K.K Road, Wayanad, Kerala 686001");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Kannur")) {
                        t1.setText("Hotels in Kannur are:");

                        t2.setText("GOKULAM ORCHID HIGHLANDS");
                        t3.setText("Chithirapuram South Power House Road, Kannur, Kerala 685565");

                        t4.setText("PERIYAR MEADOWS");
                        t5.setText("Thekkady Road, Kannur, Kerala 685509");

                        t6.setText("ABAD COPPER CASTLE ");
                        t7.setText("Pothumedu, Kannur, Kerala 685612");

                        t8.setText("HOLIDAY VISTA");
                        t9.setText("KK Road, Kannur, 685509");

                        t10.setText("CLOUDS VALLEY");
                        t11.setText("Kannan Devan Kannur, Kerala 685612");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else if (place.equals("Kasargod")) {
                        t1.setText("Hotels in kasargod are:");

                        t2.setText("DUNES");
                        t3.setText("Doraiswamy Iyer Rd, Shenoys,kasargod, Kerala 682035");

                        t4.setText("THE INTERNATIONAL HOTEL");
                        t5.setText("Opposite Chennai Silks, Veekshanam road, Mahatma Gandhi Rd, kasargod, Kerala 682035");

                        t6.setText("ABAD PLAZA");
                        t7.setText("Mahatma Gandhi Rd, Shenoys, Kochi, Kerala 682035");

                        t8.setText("GOKULAM PARK");
                        t9.setText("Muthoottu Mini Financiers, Banerji Rd, Opposite,kasargod, Kerala 682017");

                        t10.setText("THE RENAI COCHIN");
                        t11.setText("Palarivattom - Edappally Rd, Sonia Nagar,kasargod, Kerala 682025");
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                    } else {
                        Toast.makeText(getApplicationContext(), "Please selsect a proper district name.", Toast.LENGTH_LONG).show();
                    }
                }
            });

        }

        public void onNothingSelected(AdapterView<?> arg) {

        }


    }

    public void h1(View view) {
        Intent i = new Intent(getApplicationContext(), cofirmBooking.class);
        Bundle b = new Bundle();
        b.putString("Hotel", t2.getText().toString());
        b.putString("Address", t3.getText().toString());
        i.putExtras(b);
        startActivity(i);
    }

    public void h2(View view) {
        Intent i = new Intent(getApplicationContext(), cofirmBooking.class);
        Bundle b = new Bundle();
        b.putString("Hotel", t4.getText().toString());
        b.putString("Address", t5.getText().toString());
        i.putExtras(b);
        startActivity(i);

    }

    public void h3(View view) {
        Intent i = new Intent(getApplicationContext(), cofirmBooking.class);
        Bundle b = new Bundle();
        b.putString("Hotel", t6.getText().toString());
        b.putString("Address", t7.getText().toString());
        i.putExtras(b);
        startActivity(i);

    }

    public void h4(View view) {
        Intent i = new Intent(getApplicationContext(), cofirmBooking.class);
        Bundle b = new Bundle();
        b.putString("Hotel", t8.getText().toString());
        b.putString("Address", t9.getText().toString());
        i.putExtras(b);
        startActivity(i);

    }

    public void h5(View view) {
        Intent i = new Intent(getApplicationContext(), cofirmBooking.class);
        Bundle b = new Bundle();
        b.putString("Hotel", t10.getText().toString());
        b.putString("Address", t11.getText().toString());
        i.putExtras(b);
        startActivity(i);
    }

}













