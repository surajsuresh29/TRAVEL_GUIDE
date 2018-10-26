package com.example.amma.travel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signup extends AppCompatActivity
{
    EditText input_name,input_number,input_pass,confirm_pass;
    EditText input_email;
    String email;
    String emailPattern;

    int f;
    int us;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


    }
    public void created(View view)
    {
        f=0;
        input_name = (EditText)findViewById(R.id.input_name);
        input_number = (EditText)findViewById(R.id.input_number);
        input_pass = (EditText)findViewById(R.id.input_pass);
        confirm_pass = (EditText)findViewById(R.id.confirm_pass);

        final String name=input_name.getText().toString();

        final String password = input_pass.getText().toString();


        input_email  = (EditText)findViewById(R.id.input_email);
        email = input_email.getText().toString().trim();
        emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
       /* if(input_name.getText().toString().trim().length()==0)
        {
            f++;
            input_name.setError("Username is not entered");
            input_name.requestFocus();

        }
        if(input_number.getText().toString().trim().length()==0)
        {
            f++;
            input_number.setError("Phone number is not entered");
            input_number.requestFocus();

        }

        if(input_pass.getText().toString().trim().length()==0)
        {
        f++;
        input_pass.setError("password is not entered");
        input_pass.requestFocus();

        }
        if (email.matches(emailPattern)) { }

        else
        {
            f++;
            input_email.setError("invalid email");
        }
       if(!confirm_pass.equals(password))
        {
            f++;
            confirm_pass.setError("password didn't match");
            confirm_pass.requestFocus();
        }


        if(f==1)
        {*/
       final FirebaseDatabase database =FirebaseDatabase.getInstance();
        DatabaseReference dbref=database.getReference("userno");
        dbref.setValue(name);
        dbref.setValue(password);
      /*  dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                us=(int) dataSnapshot.getValue();
                DatabaseReference userRef=database.getReference("user"+us);
                userRef.child("name").setValue(name);
                userRef.child("password").setValue(password);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
Toast.makeText(signup.this,"unable to register the user",Toast.LENGTH_SHORT).show();
            }
        });
        dbref.setValue(us+1);*/

        Toast.makeText(this, "ACCOUNT CREATED", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,login.class);
        startActivity(i);
       // }
    }

}
