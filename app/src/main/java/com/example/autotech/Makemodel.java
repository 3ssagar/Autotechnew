package com.example.autotech;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;

public class Makemodel extends AppCompatActivity implements View.OnClickListener {
    EditText nameet,qtyet,pricet;
    Button postbt,retrievebt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makemodel);


        nameet = findViewById(R.id.mk);
        qtyet = findViewById(R.id.md);
        pricet = findViewById(R.id.yr);
        postbt = findViewById(R.id.add);
        retrievebt = findViewById(R.id.retrive);

        postbt.setOnClickListener(this);
        retrievebt.setOnClickListener(this);
        //ALT+ENTER
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.retrive:
                retrieveDataFromFirestore();
                break;
            case R.id.add:
                addDataIntoFirestore();
                break;
        }
    }

    public void addDataIntoFirestore(){
        String name = nameet.getText().toString();
        String qty = qtyet.getText().toString();
        String price = pricet.getText().toString();

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        HashMap<String, Object> order = new HashMap<>();
        order.put("name", name);
        order.put("qty", qty);
        order.put("price", price);

// Add a new document with a generated ID
        db.collection("Orders")
                .add(order)
                .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {
                        Toast.makeText(Makemodel.this,"Added",Toast.LENGTH_LONG).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Toast.makeText(Makemodel.this,"Failed",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void retrieveDataFromFirestore(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Orders")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            for(QueryDocumentSnapshot documentSnapshot:task.getResult()){
                                System.out.println(documentSnapshot.getData().toString());
                            }
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
}