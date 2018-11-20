package com.example.amma.travel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class frontpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    WebView webView;
    public TextView t;
    public TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);

        t=findViewById(R.id.head);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t1.setText("\n\n\n"+"Kerala, a state on India's tropical Malabar Coast, has nearly 600km of Arabian Sea shoreline. It's known for its palm-lined beaches and backwaters, a network of canals. Inland are the Western Ghats, mountains whose slopes support tea, coffee and spice plantations as well as wildlife. National parks like Eravikulam and Periyar, plus Wayanad and other sanctuaries, are home to elephants, langur monkeys and tigers.");
        t2.setText("\n\n\t\t\t\t\t\t\t\t\t\t\t\tTHINGS TO DO IN KERALA\n\n");


        t3.setText("\n"+"THEKKADY\n\n\n"+
                "Wildlife refuge, tigers, and elephants\n" +
                "Thekkady is the location of the Periyar National Park, which is an important tourist attraction in the Kerala state of India.\n"+
                "\n"+"FORT KOCHI\n\n\n" +
                "Beaches, fishing, synagogues, and basilicas\n" +
                "Fort Kochi is a region in the city of Kochi in the state of Kerala, India. This is part of a handful of water-bound regions toward the south-west of the mainland Kochi, and collectively known\n" +
                "\n"+"PERIYAR\n\n\n"+
                "Rivers, wildlife refuge, rafting, and lakes\n" +
                "Periyar is the longest river and the river with the largest discharge potential in the Indian state of Kerala. It is one of the few perennial rivers in the region and provides drinking water\n" +
                "\n"+"VEMBANAD\n\n\n" +
                "India's longest lake with a bird reserve\n" +
                "Sprawling lake with a lush shoreline known for its bird preserve, boating, fishing & festivals.\n" +
                "\n"+" ERAVIKULAM NATIONAL PARK \n\n\n" +
                "Views & wild goats in a lush setting\n" +
                "This scenic natural area with wild goats & greenery has buses that take visitors up a mountain.\n\n"+
                "\n"+"Athirappilly Falls\n\n\n" +
                "Popular destination with viewing areas\n" +
                "Paths lead to the top & bottom of this well-known, 80-foot tall waterfall, the largest in Kerala.\n\n"+
                "\n"+"PADMANABHASWAMY TEMPLE\n\n\n" +
                "Monumental Hindu shrine to Vishnu\n" +
                "1729 temple complex, known for its towering gateway and shrine to Padmanabha reclining on a serpent."
                +"\n");


        t4.setText("\n\t\t\t\t\t\t\t\t*************************************\n");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent i = new Intent(getApplicationContext(), chat.class);
                startActivity(i);*/
            }

        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.frontpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gallery) {
            Intent i = new Intent(this, profile.class);
            startActivity(i);

        } else if (id == R.id.nav_district) {
            Intent i = new Intent(this, starting_page.class);
            startActivity(i);

        } else if (id == R.id.nav_map) {
            Intent i = new Intent(this, GMapsActivity.class);
            startActivity(i);


        }



        else if (id == R.id.nav_book)
        {
            Intent i=new Intent(this,hotel1.class);
            startActivity(i);



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
