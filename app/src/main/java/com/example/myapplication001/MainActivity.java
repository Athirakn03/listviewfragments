package com.example.myapplication001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t =manager.beginTransaction();
        fragment1 f =new  fragment1();
        t.add(R.id.frame1.f);
        t.commit();





    }

    public void f1(String s) {
        FragmentManager manager1=getSupportFragmentManager();
        FragmentTransaction t1= manager1.beginTransaction();
        fragment2.f1=new fragment2();
        Bundle  b2=new Bundle();
        b2.putString("s",s);
       f1.setApperance(b2);
       t1.replace(R.id.frame1.f1);
    }
}
