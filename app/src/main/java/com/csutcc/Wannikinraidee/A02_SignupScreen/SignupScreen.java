package com.csutcc.Wannikinraidee.A02_SignupScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.csutcc.Wannikinraidee.R;

public class SignupScreen extends AppCompatActivity {
    Button register,facebook,signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a02_signup_screen);


        //LOGIN BUTTON


        register =(Button)findViewById(R.id.register_press);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Register Pressed",Toast.LENGTH_SHORT).show();
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

        signin =(Button)findViewById(R.id.signin_press);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"SignIn Pressed",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
