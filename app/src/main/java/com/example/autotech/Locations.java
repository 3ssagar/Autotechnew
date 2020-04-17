package com.example.autotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class Locations extends AppCompatActivity {


    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        b1= findViewById(R.id.button4);
        b2 = findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getBaseContext (),"YOUR LOCATION IS SELECTED",Toast.LENGTH_SHORT ).show ();
                Intent i = new Intent(Locations.this, Home.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getBaseContext (),"YOUR LOCATION IS SELECTED",Toast.LENGTH_SHORT ).show ();
                Intent i = new Intent(Locations.this, Home.class);
                startActivity(i);

            }
        });
    }

}
