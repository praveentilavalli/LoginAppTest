package com.example.adityacomputers.loginapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText etuname,etpasswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initilize the resources with their ids
        textView=(TextView)findViewById(R.id.textView);
        etuname=(EditText)findViewById(R.id.etUname);
        etpasswd=(EditText)findViewById(R.id.etpassword);
    }
    //method to work when login button was clciked
    public void loginButtonClicked(View v)
    {
        //read the username and password from the edittext
        String uname=etuname.getText().toString();
        String passwd=etpasswd.getText().toString();
        //check the username and password is valid or not
        if(uname.equals("praveen")&&passwd.equals("1234")) {

            //if it is valid display the username in textview and display text login successfull in toast
            textView.setText(uname);
            Toast.makeText(getApplicationContext(), "login successfull", Toast.LENGTH_LONG).show();
        }
        //otherwise display message as login failure
        else
            Toast.makeText(getApplicationContext(),"login failure",Toast.LENGTH_LONG).show();
    }
}
