package com.faraitfusion.schoolproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class retrive extends AppCompatActivity {

TextView textView;
ArrayList<String> arrayList = new ArrayList<>();
    //database reference
DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(retrive.this, android.R.layout.simple_list_item_1, arrayList);
        textView = findViewById(R.id.listview);

        mDatabase = FirebaseDatabase.getInstance().getReference("Users");



        //adding an event listener to fetch values
    }
}