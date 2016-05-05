package com.example.pc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Checkout extends AppCompatActivity {

    Bundle extras =getIntent().getExtras();
   {
        String value = extras.getString("selected");
        String fry = extras.getString("selectedFries");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }
}
