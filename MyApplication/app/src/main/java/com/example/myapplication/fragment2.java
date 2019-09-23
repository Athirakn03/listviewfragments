package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment2 extends Fragment {
    TextView t1;



    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1 = inflater.inflate(R.layout.fragment_fragment1, container, false);
        t1 = v1.findViewById(R.id.textview);
        Bundle b = getArguments();
        if (b != null) {
            String s = b.getString("s");
            t1.setText(s);

        }
        return v1;
    }

}