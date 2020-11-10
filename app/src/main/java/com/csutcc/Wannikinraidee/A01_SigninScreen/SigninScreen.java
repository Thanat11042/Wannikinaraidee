package com.csutcc.Wannikinraidee.A01_SigninScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.csutcc.Wannikinraidee.R;

public class SigninScreen extends AppCompatActivity {
Button login,facebook,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a01_signin_screen);

        //LOGIN BUTTON


        login =(Button)findViewById(R.id.login_press);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Login Pressed",Toast.LENGTH_SHORT).show();
            }
        });


        //FACEBOOK BUTTON

        facebook =(Button)findViewById(R.id.facebook_press);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Facebook Pressed",Toast.LENGTH_SHORT).show();
            }
        });


        //SIGNUP BUTTON

        signup =(Button)findViewById(R.id.signup_press);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"SignUp Pressed",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
