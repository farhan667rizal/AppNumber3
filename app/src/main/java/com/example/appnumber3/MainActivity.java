package com.example.appnumber3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);
        TextView txt4 = findViewById(R.id.txt4);
        TextView txt5 = findViewById(R.id.txt5);

        String myStringValue = "Android Programming is FUN!";

        txt1.setText(myStringValue);

        txt2.setText(myStringValue.charAt(0) + "");
        //to convert return type of charAt  we need to concatinate
            // with "" becuse it need a string
        txt3.setText(myStringValue.substring(2)); //start at no ending
        txt4.setText(myStringValue.substring(5, 9)); //start at ending at(ending eliminated)
//        ini commit github
    }


}
