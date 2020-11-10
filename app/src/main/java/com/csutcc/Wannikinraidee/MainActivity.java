package com.csutcc.Wannikinraidee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a01_signin_screen);


        /*Button laywise =(Button) findViewById(R.id.view_output);
        laywise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), LayoutWise.class);
                startActivity(i);

            }
        });*/


    }
}
