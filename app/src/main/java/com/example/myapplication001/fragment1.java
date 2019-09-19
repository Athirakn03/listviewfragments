package com.example.myapplication001;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {

    ListView lv;
    ArrayList<String>al;
    ArrayAdapter<String>ar;


    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
        lv=v.findViewById(R.id.list1);
        al=new ArrayList<String>();
        ar=new ArrayAdapter<String>(getActivity(),android.R.layout. simple_list_item_activated_1,al);
        lv.setAdapter(ar);
        al.add("chennai");
        al.add("banglore");
        al.add("delhi");
        al.add("mysore");
        al.add("mumbai");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s=al.get(position);
            MainActivity mn1=(MainActivity) getActivity();
            mn1.f1(s);
            }
        });




        return  v;

    }

}
