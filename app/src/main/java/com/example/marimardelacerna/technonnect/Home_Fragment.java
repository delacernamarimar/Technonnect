package com.example.marimardelacerna.technonnect;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by marimardelacerna on 08/05/2017.
 */

public class Home_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */



//        return inflater.inflate(R.layout.home_fragment, container, false);



        View view = inflater.inflate(R.layout.home_fragment, container, false);

        ListView lv = (ListView) view.findViewById(R.id.listViewHome);
        ArrayList<Devices> list = new ArrayList<Devices>();
        MyAdapter adapter;

        list.add(new Devices(R.drawable.ic_menu_camera, "we1"));
        list.add(new Devices(R.drawable.ic_menu_camera, "we2"));

        adapter = new MyAdapter(getContext(), list);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;

    }
}
