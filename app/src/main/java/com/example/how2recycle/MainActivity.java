package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

    }

    // Method sends user to EnterDataActivity
    public void goEnterData(View view) {
        Intent intent = new Intent( this,EnterDataActivity.class);
        startActivity(intent);
    }

    // Method sends user to VideoTutorial
    public void goTutorial(View view) {
        Intent intent = new Intent( this, VideoTutorial.class);
        startActivity(intent);
    }

    // Method sends user to AboutAppActivity
    public void goAboutApp(View view) {
        Intent intent = new Intent(this, AboutAppActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        // code here to show dialog
        this.finish();
    }

}
