package com.example.autotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Interimservices extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b_intirm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_interimservices );
        b_intirm = findViewById (R.id.b8  );
        e1=findViewById ( R.id.e1 );
        e2=findViewById ( R.id.e2 );
        e3=findViewById ( R.id.e3 );
        e4=findViewById ( R.id.e4 );

        b_intirm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Your Service is Booked" , Toast.LENGTH_SHORT ).show();
                Intent i= new Intent ( Interimservices.this,Services.class );
                startActivity ( i );
            }
        } );
    }
}
