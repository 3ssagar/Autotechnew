package com.example.autotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Services extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_services );
        b1=findViewById ( R.id.b6 );
        b2=findViewById ( R.id.b7 );
        b3=findViewById ( R.id.b10 );
        b1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( Services.this,Interimservices.class);
                startActivity ( i );
            }
        } );

        b2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( Services.this, Fullcarservice.class);
                startActivity ( i );
            }
        } );
        b3.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i= new Intent ( Services.this,Home.class );
                startActivity ( i );
            }
        } );
    }
}
