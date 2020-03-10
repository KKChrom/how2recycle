package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class EnterDataActivity extends AppCompatActivity {

    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";
    private EditText mNumberEditText;

    //Some

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Get the number input
        mNumberEditText = findViewById(R.id.number_input);
    }

    public void launchInfoActivity(View view) {
        // Create the Intent and add the number input as an extra
        String number = mNumberEditText.getText().toString();
        mNumberEditText.setText("");
        try {
            int checkingInput = Integer.parseInt(number);
            if (checkingInput < 1 || checkingInput > 7) {
                Toast.makeText(getApplicationContext(), "Please enter a number between 1 and 7", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, InfoActivity.class);
                intent.putExtra(EXTRA_RECYCLE_NUMBER, number);
                startActivity(intent);
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Please enter a number between 1 and 7", Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

