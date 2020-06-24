package com.faraitfusion.schoolproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class dataretrive extends AppCompatActivity {
    private EditText adname, adpass;
    Button admin, dlete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataretrive);
        adname = findViewById(R.id.admin_name);
        adpass = findViewById(R.id.admin_password);

        admin = findViewById(R.id.adminlogin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adname.getText().toString().equals("Mahmuda akhi") && adpass.getText().toString().equals("1234567")) {
                    Intent intent = new Intent(dataretrive.this, retrive.class);
                    startActivity(intent);


                }
            }
        });

    }
}