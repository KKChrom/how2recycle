package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {
    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String val = getIntent().getStringExtra(EXTRA_RECYCLE_NUMBER);
        System.out.println(val+" is the value passed ");

    }

}
