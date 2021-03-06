package com.csutcc.Wannikinraidee.A011_Notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.csutcc.Wannikinraidee.R;

public class Notification_Listview_Adapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] title,time,content;
    int[] images;
    LayoutInflater inflater;

    public Notification_Listview_Adapter(Context context, String[] title,String[] time,String[] content,int[] images) {
        this.context = context;
        this.title = title;
        this.time = time;
        this.content = content;
        this.images = images;
    }

    @Override
    public int getCount() {
        return title.length;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtname,txttime,textcontent;
        ImageView imagename;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.a11_notification_litsitem, parent, false);

        // Locate the TextViews in listview_item.xml
        txtname = (TextView) itemView.findViewById(R.id.title_content);

        txttime = (TextView) itemView.findViewById(R.id.subtitle_content);

        textcontent = (TextView) itemView.findViewById(R.id.content);

        // Locate the ImageView in listview_item.xml
        imagename = (ImageView) itemView.findViewById(R.id.image_content);

        // Capture position and set to the TextViews
        txtname.setText(title[position]);

        txttime.setText(time[position]);

        textcontent.setText(content[position]);


        // Capture position and set to the ImageView
        imagename.setImageResource(images[position]);

        return itemView;
    }
}
