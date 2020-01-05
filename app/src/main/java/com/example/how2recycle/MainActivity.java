package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private Button sender;
    private Button videobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sends user to EnterDataActivity
        sender = findViewById(R.id.sender);
        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEnterData();
            }
        });

        // Sends user to tutorial
        videobutton = findViewById(R.id.videobutton);
        videobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goTutorial();
            }
        });


    }

    // Method sends user to the tutorial
    private void goTutorial() {
        Intent intent = new Intent( this, VideoTutorial.class);
        startActivity(intent);
    }

    // Mehods sends the user to EnterDataActivity
    public void goEnterData() {
        Intent intent = new Intent( this,EnterDataActivity.class);
        startActivity(intent);
    }


}
