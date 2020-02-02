package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {
    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String desc;
        String path;
        String val = getIntent().getStringExtra(EXTRA_RECYCLE_NUMBER);
        switch (val) {
            case "1":
                path = "raw/rone.png";


                break;

            case "2":
                path = "raw/rtwo.png";
                break;

            case "3":
                path = "raw/rthree.png";
                break;

            case "4":
                path = "raw/rfour.png";
                break;

            case "5":
                path = "raw/rfive.png";

                break;

            case "6":
                path = "raw/rsix.png";
                break;

            case "7":
                path = "raw/rseven.png";
                break;


        }

    }

}
