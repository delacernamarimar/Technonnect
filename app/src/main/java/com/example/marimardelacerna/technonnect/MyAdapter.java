package com.example.marimardelacerna.technonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ryan_boter on 5/11/2017.
 */

class MyAdapter extends BaseAdapter{

    Context context;
    ArrayList<Devices> list;
    LayoutInflater inflater;


    public MyAdapter(Context context, ArrayList<Devices> list) {
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DeviceHandler handler = null;
        if(convertView == null){
            convertView = this.inflater.inflate(R.layout.devices_layout, null);
            handler = new DeviceHandler();

            handler.iv = (ImageView) convertView.findViewById(R.id.imageView1);
            handler.name = (TextView) convertView.findViewById(R.id.textView1);


            convertView.setTag(handler);
        }else{
            handler = (DeviceHandler) convertView.getTag();
        }

        handler.iv.setImageResource(list.get(position).getPic());
        handler.name.setText(list.get(position).getName());


        return convertView;
    }

    static class DeviceHandler{
        ImageView iv;
        TextView name;
    }
}
