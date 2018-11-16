package com.example.amma.travel_guide;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button login,signup;
    int f;
    EditText user,pass;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void log_click(View view)
    {
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);
        user = (EditText)findViewById(R.id.input_user);
        pass = (EditText)findViewById(R.id.input_pass);
        String username=user.getText().toString();
        String password =pass.getText().toString();
        f=0;
       /* if(user.getText().toString().trim().length()==0)
        {
            f++;
            user.setError("Username is not entered");
            user.requestFocus();

        }
        if(pass.getText().toString().trim().length()==0)
        {
            f++;
            pass.setError("Password is not entered");
            pass.requestFocus();
        }
*/
        if(f==0)
        {
           // Bundle b=new Bundle();
            Toast.makeText(this, "welcome" + username, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,frontpage.class);
            //b.putString("username",username);
            //i.putExtras(b);
            ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
                    0, view.getWidth(), view.getHeight());
            startActivity(i);
        }

        }
    public void Signup(View view)
    {
        Intent i = new Intent(this,booking.class);

        startActivity(i);
    }

    }





