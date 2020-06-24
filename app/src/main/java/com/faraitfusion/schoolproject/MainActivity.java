package com.faraitfusion.schoolproject;


import android.app.AlertDialog;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    private EditText emailTV, passwordTV;
    private Dialog mydialog;
    EditText stu_name, roll, phone;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth =FirebaseAuth.getInstance();
        emailTV = findViewById(R.id.email);
        passwordTV = findViewById(R.id.password);
        stu_name= findViewById(R.id.stu_name);

        phone= findViewById(R.id.phone);

        roll= findViewById(R.id.roll);
        mydialog = new Dialog(this);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Class_Name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected (AdapterView < ? > parent){

            }
        });

    }

    public void ShowPopup(View v) {
        TextView txtclose;
        Button callnow;
        mydialog.setContentView(R.layout.activity_login_pending);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose);

        callnow = (Button) mydialog.findViewById(R.id.callnow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mydialog.dismiss();
            }
        });
        callnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+৮৮০১৮১৯২৭৯০২৫"));
                startActivity(intent);
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();


    String email, password;
    email =emailTV.getText().

    toString();

    password =passwordTV.getText().

    toString();

        if(TextUtils.isEmpty(email))

    {
        Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
        return;
    }
        if(TextUtils.isEmpty(password))

    {
        Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
        return;
    }

        mAuth.createUserWithEmailAndPassword(email,password)
            .

    addOnCompleteListener(new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete (@NonNull Task < AuthResult > task) {
            if (task.isSuccessful()) {
                Toast.makeText(getApplicationContext(), "Registration successful!", Toast.LENGTH_LONG).show();


                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                //startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Registration failed! Please try again later", Toast.LENGTH_LONG).show();
            }
        }
    });
}



    }
