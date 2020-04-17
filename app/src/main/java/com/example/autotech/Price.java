package com.example.autotech;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Price extends AppCompatActivity {
   TextView e1,e2,e3;
    String oilcost,labourcost,gst;
    Button b1;

  //  @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        e1 = findViewById(R.id.oilcost);
       e2 = findViewById(R.id.labourcost);
      e3 = findViewById(R.id.gst);
        b1= findViewById(R.id.back);
       // e1.setText(oilcost);
       // e2.setText(labourcost);
        //e3.setText(gst);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // oilcost = e1.getText().toString();
               // labourcost = e2.getText().toString();
               // gst= e3.getText().toString();
                Intent i1 = new Intent(Price.this, Home.class);
                //i1.putExtra("key5", "oilcost");
                //i1.putExtra("key6", "labourcost");
                //i1.putExtra("key7", "gst");
                startActivity(i1);
            }
        });

    }
}
