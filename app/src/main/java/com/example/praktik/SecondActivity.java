package com.example.praktik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Person;
    CheckBox A,B,C, A1, B1, C1;
    Button btn2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Person = findViewById(R.id.Person);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        


    }

    @Override
    public void onClick(View v) {
        if (Person.getText() != null, Person.getText() != "");


            Intent intent1 = new Intent();
            intent1.setClass(this, vtorayachast.class);
            intent1.putExtra("name", Person.getText().toString());
            startActivity(intent1);



    }










        }


