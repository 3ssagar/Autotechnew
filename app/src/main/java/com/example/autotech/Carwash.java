package com.example.autotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Carwash extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    //TextView textview2;
    Button b_carwash;
    String CarModelandNo,WashType,ContactNo,Schedulewash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_carwash );
        b_carwash=findViewById ( R.id.b5 );
        e1=findViewById ( R.id.e1 );
        e2=findViewById ( R.id.e2 );
        e3=findViewById ( R.id.e3 );
        e4=findViewById ( R.id.e4 );
//        textview2=findViewById ( R.id.textView2 );
        e1.setText ( CarModelandNo );
        e2.setText ( WashType );
        e3.setText ( Schedulewash );
        e4.setText ( ContactNo );


        b_carwash.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "YOUR CARWASH IS SCHEDULED THANKS" , Toast.LENGTH_SHORT ).show();
                CarModelandNo=e1.getText().toString();
                WashType=e2.getText().toString();
                Schedulewash=e3.getText().toString();
                ContactNo=e4.getText().toString();
                Intent i1=new Intent (Carwash.this, Home.class );
                startActivity(i1);
            }
        } );


    }
}
