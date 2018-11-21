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
                        txt2.setText("KOVALAM BEACH"+"\n"+"PADMANABHAPURAM  PALACE"+"\n"+"THIRUVANANTHPURAM ZOO"+"\n"+"ATTUKAL TEMPLE"+"\n"+"AGASTYA MALA"+"\n"+"VIZHINJAM LIGHTHOUSE"+"\n"+"SHANKUMUKHM BEACH"+"\n"+"POOVAR ISLAND"+"\n"+"PAZHAVANGADI GANAPATHY TEMPLE");
                    }

                    else if(place.equals("Kollam"))
                    {

                        image.setImageResource(R.drawable.kollam);
                        txt2.setText("GADAYU PARA"+"\n"+"ASHTAMUDI LAKE"+"\n"+"KOLLAM BEACH"+"\n"+"THANGASSERY LIGHTHOUSE"+"\n"+"AGASTYA MALA"+"\n"+"THEVVALLY"+"\n"+"PARAVUR LAKE"+"\n"+"KOLLAM PORT"+"\n"+"NEENDAKARA PORT");

                    }
                    else if(place.equals("Pathanamthitta"))
                    {

                        image.setImageResource(R.drawable.gavi);
                        txt2.setText("GAVI"+"\n"+"CHAKKULATHUKAVU TEMPLE"+"\n"+"ADAVI ECO TOURISM"+"\n"+"KONNI"+"\n"+"KAKKI RESERVOIR"+"\n"+"PERUNTHENARUVI FALLS"+"\n"+"ARANMULA PARTHASARATHY TEMPLE"+"\n"+"PERIYAR NATIONAL PARK"+"\n"+"SABARIMALA");
                    }
                    else if(place.equals("Alappey"))
                    {

                        image.setImageResource(R.drawable.allapy);
                        txt2.setText("HOUSEBOAT TOUR"+"\n"+"FERRY RIDE"+"\n"+"ALAPPUZHA LIGHTHOUSE"+"\n"+"KUTTANAD"+"\n"+"KRISHNAPURAM PALACE"+"\n"+"AMBALAPUZHA SREEKRISHNA TEMPLE"+"\n"+"VEMBANAD"+"\n"+"ALAPPUZHA BEACH"+"\n"+"MARARI BEACH");
                    }
                    else if(place.equals("Kottayam"))
                    {
                        image.setImageResource(R.drawable.kumarakam);
                        txt2.setText("THIRUNNAKARA MAHADEVA TEMPLE"+"\n"+"THAZHATHANGADY JUMA MASJID"+"\n"+"GOOD SHEPHERED CHURCH"+"\n"+"ETTUMANUR TEMPLE"+"\n"+"THALIYIL MAHADEVA TEMPLE");

                    }
                    else if(place.equals("Idukki"))
                    {
                        image.setImageResource(R.drawable.munnar);
                        txt2.setText("ERAVIKULAM NATIONAL PARK"+"\n"+"MATTUPETTY DAM"+"\n"+"ANAMUDI"+"\n"+"ELLIKAL KALLU"+"\n"+"MEESHPULIMALA"+"\n"+"MULLAPERIYAR DAM"+"\n"+"IDUKKI DAM"+"\n"+"KOLULKUMALAI");
                    }
                    else if(place.equals("Ernakulam"))
                    {
                        image.setImageResource(R.drawable.kochisky);
                        txt2.setText("MARINE DRIVE"+"\n"+"FORT KOCHI"+"\n"+"CHERAI BEACH"+"\n"+"KUZHUPILLY BEACH"+"\n"+"VYPIN"+"\n"+"JEWS STREET"+"\n"+"EZHATTUMUGAM"+"\n"+"ILLITHODU"+"\n"+"KADAMAKUDY");
                    }
                    else if(place.equals("Thrissur"))
                    {
                        image.setImageResource(R.drawable.athirapally);
                        txt2.setText("VADAKKUMNATHA TEMPLE"+"\n"+"THRISSUR ZOO"+"\n"+"SAKTHAN THAMBURAN PALACE"+"\n"+"PARAMEKAVU TEMPLE"+"\n"+"THEKKINKADU MAIDHAN"+"\n"+"POOMALA DAM"+"\n"+"PEECHI DAM");

                    }
                    else if(place.equals("Palakkad"))
                    {
                        image.setImageResource(R.drawable.nelli);
                        txt2.setText("NELIYAMPATHY"+"\n"+"PALAKKAD FORT"+"\n"+"MALAMPUZHA DAM"+"\n"+"MUKKURTHI NATIONAL PARK"+"\n"+"TPOTHUNDI DAM"+"\n"+"DHONI WATERFALLS"+"\n"+"SILENT VALLEY");
                    }
                    else if(place.equals("Malappuram"))
                    {
                        image.setImageResource(R.drawable.mpm);
                        txt2.setText("KODIKUTHIMALA"+"\n"+"ADYANPARA WATER FALLS"+"\n"+"THIRUNAVAYA TEMPLE"+"\n"+"KOTTAKUNNU"+"\n"+"THIRUMANDHAMKUNNU TEMPLE"+"\n"+"NILAMBUR TEAK MUSEUM"+"PONNANI BIYYAM KAYAL PARK"+"\n"+"PONNANI BEACH"+"\n"+"MINI OOTY");
                    }
                    else if(place.equals("Calicut"))
                    {
                        image.setImageResource(R.drawable.kozhikode);
                        txt2.setText("KOZHIKODE BEACH"+"\n"+"MITTAYI THERUVU"+"\n"+"MANANCHIRA SQUARE"+"\n"+"KADALUNDI  BIRD SANCTUARY"+"\n"+"BEYPORE BEACH"+"\n"+"TALI SIVA TEMPLE"+"MISHKAL MOSQUE"+"\n"+"KAPPAD BEACH"+"\n"+"VASCODA GAMA MEMMORIAL CHURUCH"+"\n"+"REGIONAL SCIENCE CENTRE AND PLANETARIUM");

                    }
                    else if(place.equals("Wayanad"))
                    {
                        image.setImageResource(R.drawable.wayanad);
                        txt2.setText("MUTHANGA WILDLIFE SANCTUARY"+"\n"+"THOLPETTY WILDLIFE SANCTUARY"+"\n"+"CHEMBRA PEAK"+"\n"+"EDAKKAL CAVES"+"\n"+"BANASURASAGAR DAM"+"\n"+"SOOCHIPARA FALLS"+"\n"+"KURUVA DWEEP"+"\n"+"THIRUNNELI TEMPLE"+"\n"+"NEELIMALA VIEW POINT"+"\n"+"PAZHASSI RAJA TOMB");
                    }
                    else if(place.equals("Kannur"))
                    {
                        image.setImageResource(R.drawable.theyyam);
                        txt2.setText("PARASSINI KADAVU TEMPLE"+"\n"+"MUZHUPPILLANGAD BEACH"+"\n"+"MAPPILA BAY"+"\n"+"ARAKKAL MUSEUM"+"\n"+"KANNUR BEACH"+"\n"+"KANNUR FORT"+"\n"+"PAYYAMBALAM BEACH");
                    }
                    else if(place.equals("Kasargod"))
                    {
                        image.setImageResource(R.drawable.kasa);
                        txt2.setText("BEKAL FORT"+"\n"+"MAIPADY PALACE"+"\n"+"HOSDURG FORT"+"\n"+"CANDRAGIRI FORT"+"\n"+"VALIYAPARAMBA");

                    }







                }
            });


        }

        public void onNothingSelected(AdapterView<?> arg) {

        }
    }
}

