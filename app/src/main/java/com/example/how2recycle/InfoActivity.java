package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String val = getIntent().getStringExtra("EXTRA_RECYCLE_NUMBER");
        System.out.println(val+" is the value passed ");
    }

}
