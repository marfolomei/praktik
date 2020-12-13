package com.example.praktik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class vtorayachast extends AppCompatActivity {
    TextView Person2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vtorayachast);
        Person2 =findViewById(R.id.Person2);
        Intent intent1 = getIntent();
        String name =  intent1.getStringExtra("name");
        Person2.setText(name);

    }

}