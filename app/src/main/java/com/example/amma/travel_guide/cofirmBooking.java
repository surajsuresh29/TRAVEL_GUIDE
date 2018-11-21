package com.example.amma.travel_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class cofirmBooking extends AppCompatActivity {
    TextView t1;
    EditText e1,e2,e3,e4;
    Button b1;
    int f=0;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference dbref = database.getReference("users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofirm_booking);
        t1=findViewById(R.id.txt1);
        e1 =findViewById(R.id.name);
        e2 = findViewById(R.id.phnno);
        e3 = findViewById(R.id.date);
        e4 = findViewById(R.id.days);
        b1 = findViewById(R.id.submit);

        Intent in = getIntent();
        Bundle b = in.getExtras();
        final String Hotel = b.getString("Hotel");
        String Address = b.getString("Address");
        t1.setText(Hotel+"\n"+Address);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().trim().length() == 0) {
                    f++;
                    e1.setError("NAME is not entered");
                    e1.requestFocus();

                }
                if (e2.getText().toString().trim().length() == 0) {
                    f++;
                    e2.setError("PHONE NUMBER is not entered");
                    e2.requestFocus();

                }
                if (e3.getText().toString().trim().length() == 0) {
                    f++;
                    e3.setError("DATE is not entered");
                    e3.requestFocus();

                }
                if (e4.getText().toString().trim().length() == 0) {
                    f++;
                    e4.setError("DAYS is not entered");
                    e4.requestFocus();

                }
                if (f == 0) {


                    dbref.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            int nousr = Integer.parseInt(String.valueOf(dataSnapshot.getValue()));
                            dbref.setValue(nousr + 1);
                            nousr = (nousr + 1);
                            DatabaseReference usrRef = database.getReference(dbref.getKey() + nousr);
                            usrRef.child("Hotel").setValue(Hotel);
                            usrRef.child("Name").setValue(e1.getText().toString());
                            usrRef.child("Phone").setValue(e2.getText().toString());
                            usrRef.child("Date").setValue(e3.getText().toString());
                            usrRef.child("Days").setValue(e4.getText().toString());
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {
                            Toast.makeText(cofirmBooking.this, "Unable to connect. Please try again later.", Toast.LENGTH_LONG).show();
                        }
                    });
                    Intent i = new Intent(getApplicationContext(), BookingConfirmed.class);
                    Bundle b = new Bundle();
                    b.putString("Hotel", Hotel);
                    b.putString("Name", e1.getText().toString());
                    b.putString("Phone", e2.getText().toString());
                    b.putString("Date", e3.getText().toString());
                    b.putString("Days", e4.getText().toString());
                    i.putExtras(b);
                    startActivity(i);
                    Toast.makeText(cofirmBooking.this, "Booking Succesfull", Toast.LENGTH_LONG).show();
                }
                }

        });

            }
        }