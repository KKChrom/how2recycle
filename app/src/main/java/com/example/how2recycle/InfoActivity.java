package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.desc);

        String val = getIntent().getStringExtra(EXTRA_RECYCLE_NUMBER);
        switch (val) {
            case ("1"):
                imageView.setImageResource(R.drawable.rone);
                textView.setText(R.string.info1);
                break;

            case "2":
                textView.setText(R.string.info2);
                imageView.setImageResource(R.drawable.rtwo);
                break;

            case "3":
                imageView.setImageResource(R.drawable.rthree);
                textView.setText(R.string.info3);
                break;

            case "4":
                imageView.setImageResource(R.drawable.rfour);
                textView.setText(R.string.info4);
                break;

            case "5":
                imageView.setImageResource(R.drawable.rfive);
                textView.setText(R.string.info5);
                break;

            case "6":
                imageView.setImageResource(R.drawable.rsix);
                textView.setText(R.string.info6);
                break;

            case "7":
                imageView.setImageResource(R.drawable.rseven);
                textView.setText(R.string.info7);
                break;

        }

    }

}
