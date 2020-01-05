package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class EnterDataActivity extends AppCompatActivity {

    public static final String EXTRA_RECYCLE_NUMBER =
            "com.example.how2recycle.extra.RECYCLE_NUMBER";
    private EditText mNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);

        // Get the number input
        mNumberEditText = findViewById(R.id.number_input);
    }

    public void launchInfoActivity(View view) {
        // Create the Intent and add the number input as an extra
        Intent intent = new Intent(this, InfoActivity.class);
        int number = Integer.parseInt(mNumberEditText.getText().toString());
        intent.putExtra(EXTRA_RECYCLE_NUMBER, number);

        // Start the activity
        startActivity(intent);
    }
}
