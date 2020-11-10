package com.csutcc.Wannikinraidee.A013_AllCategory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.csutcc.Wannikinraidee.R;

public class A01_StarterTab extends Fragment {

    ListView list;
    Starter_Listview_Adapter adapter;
    String[] name,message;

    int[] image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.a13_startertab, container, false);


        name = new String[]{ "Spicy Fried Rice &amp; Bacon Amet", "Shrimp Curry Burger Ipsam dolor Sit", "Masala Spiced Chickpeas Dolor Amet", "Kung Pao Pastrami ad Minima Sit", "Chicken Doro Wat Nisi Commodo Amet","Mango Cile Chutney Et Dolore Sit"};

        message = new String[]{ "$30", "$65", "$20", "$75", "$10", "$61", "$100","$10","$80"};


        image = new int[] { R.drawable.listimg1,R.drawable.listimg2,
                R.drawable.listimg3,R.drawable.listimg4,
                R.drawable.listimg5,R.drawable.listimg6};

        // Locate the ListView in listview_main.xml
        list = (ListView)view.findViewById(R.id.mylist);

        // Pass results to ListViewAdapter Class
        adapter = new Starter_Listview_Adapter(getActivity(), name,message,image);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getActivity(),"You have selected :"+name[position], Toast.LENGTH_SHORT).show();


            }

        });


        return view;
    }

}
