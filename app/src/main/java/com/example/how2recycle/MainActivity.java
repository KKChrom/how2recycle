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
        sender = findViewById(R.id.sender);

        videobutton = findViewById(R.id.videobutton);
        videobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goTutorial();
            }
        });


        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEnterData();
            }
        });
    }

    private void goTutorial() {
        Intent intent = new Intent( this, VideoTutorial.class
        );
        startActivity(intent);
    }

    public void goEnterData()
    {
        Intent intent = new Intent( this,EnterDataActivity.class
        );
        startActivity(intent);
    }


}
