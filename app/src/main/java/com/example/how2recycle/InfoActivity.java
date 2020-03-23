package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView imageView = findViewById(R.id.imageView);
        ImageView leftView = findViewById(R.id.left_image);
        ImageView rightView = findViewById(R.id.right_image);


        TextView textView = findViewById(R.id.desc);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        String val = getIntent().getStringExtra(EXTRA_RECYCLE_NUMBER);//value from enter data activity
        switch (val) { //different cases depending on what number was picked,
            case "1":
                imageView.setImageResource(R.drawable.resincode_1);
                leftView.setImageResource(R.drawable.oneone);
                rightView.setImageResource(R.drawable.onetwo);
                textView.setText(R.string.info1);
                break;

            case "2":
                textView.setText(R.string.info2);
                imageView.setImageResource(R.drawable.resincode_2);
                leftView.setImageResource(R.drawable.twoone);
                rightView.setImageResource(R.drawable.twotwo);
                break;

            case "3":
                imageView.setImageResource(R.drawable.resincode_3);
                leftView.setImageResource(R.drawable.threeone);
                rightView.setImageResource(R.drawable.threetwo);
                textView.setText(R.string.info3);
                break;

            case "4":
                imageView.setImageResource(R.drawable.resincode_4);
                leftView.setImageResource(R.drawable.fourone);
                rightView.setImageResource(R.drawable.fourtwo);
                textView.setText(R.string.info4);
                break;

            case "5":
                imageView.setImageResource(R.drawable.resincode_5);
                leftView.setImageResource(R.drawable.fiveone);
                rightView.setImageResource(R.drawable.fivetwo);
                textView.setText(R.string.info5);
                break;

            case "6":
                imageView.setImageResource(R.drawable.resincode_6);
                leftView.setImageResource(R.drawable.sixone);
                rightView.setImageResource(R.drawable.sixtwo);
                textView.setText(R.string.info6);
                break;

            case "7":
                imageView.setImageResource(R.drawable.resincode_7);
                leftView.setImageResource(R.drawable.sevenone);
                rightView.setImageResource(R.drawable.seventwo);
                textView.setText(R.string.info7);
                break;
        }

    }

    public void launchMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
