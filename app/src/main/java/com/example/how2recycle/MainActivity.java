package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button sender;
    private Button ibutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sender = findViewById(R.id.sender);
        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEnterData();
            }
        });
        ibutton=findViewById(R.id.info_button);
        ibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goInfo();
            }
        });
    }
    public void goEnterData()
    {
        Intent intent = new Intent( this,EnterDataActivity.class
        );

        startActivity(intent);
    }
    public void goInfo()
    {
        Intent intent = new Intent( this,AboutAppActivity.class
        );

        startActivity(intent);
    }
}