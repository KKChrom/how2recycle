package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sends user to EnterDataActivity
        Button mStartApp = findViewById(R.id.start_app);
        mStartApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEnterData();
            }
        });

        // Sends user to tutorial
        Button mVideoButton = findViewById(R.id.start_videotutorial);
        mVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goTutorial();
            }
        });


    }

    // Method sends user to VideoTutorial
    private void goTutorial() {
        Intent intent = new Intent( this, VideoTutorial.class);
        startActivity(intent);
    }

    // Method sends user to EnterDataActivity
    public void goEnterData() {
        Intent intent = new Intent( this,EnterDataActivity.class);
        startActivity(intent);
    }


}
