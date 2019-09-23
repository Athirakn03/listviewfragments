package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity<onClickListener> extends AppCompatActivity implements View.OnClickListener {
private Button fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

private onClickListener clickListener= new View.OnClickListener() {

    @Override
    public void onClick(View v) {

    fragment.setOnClickListener(View.OnClickListener);
        Toast.makeText(getApplicationContext(),"opening cities list", Toast.LENGTH_SHORT).show();
    }
    public void cities(View view){
        Intent i = new Intent(this,cities.class);
        startActivity(i);

}


}
