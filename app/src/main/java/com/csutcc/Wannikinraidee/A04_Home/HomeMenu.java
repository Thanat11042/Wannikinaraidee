package com.csutcc.Wannikinraidee.A04_Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.csutcc.Wannikinraidee.R;

public class HomeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a04_home_menu);

        //LOGIN BUTTON


        Button search =(Button)findViewById(R.id.search_press);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Search Pressed",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
