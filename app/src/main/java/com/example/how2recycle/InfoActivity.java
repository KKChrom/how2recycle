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
                textView.setText("Polyethylene terephthalate(PETE/PET) is the material that is used in the packaging of foods and beverages");
                break;

            case "2":
                textView.setText("High Density polyethylene(HDPE) is used in bottles, cups. milk jugs, piping, plastic lumber and many more day to day things");
                imageView.setImageResource(R.drawable.rtwo);
                break;

            case "3":
                imageView.setImageResource(R.drawable.rthree);
                textView.setText("Polyvinyl chloride(PVC) is used in the industry in things like pipes, sides, and flooring");
                break;

            case "4":
                imageView.setImageResource(R.drawable.rfour);
                textView.setText("Low-density polyethylene(LDPE) is used in a lot of commonplace objects such as plastic bags, six-pack rings, and tubing");
                break;

            case "5":
                imageView.setImageResource(R.drawable.rfive);
                textView.setText("Polypropylene(PP) is used in the industry in things like auto parts, industrial fibres, and food containers");
                break;

            case "6":
                imageView.setImageResource(R.drawable.rsix);
                textView.setText("Polystyrene(PS) is used in lots of daytoday things like plastic utensils, styrofoam, and cafeteria trays");
                break;

            case "7":
                imageView.setImageResource(R.drawable.rseven);
                textView.setText("This is the name of other plastics(Acrylic, Nylon, Polycarbonate, and Polylactic Acid) which are used in a variety of different objects");
                break;
            default:

                Toast.makeText(getApplicationContext(),"Need values between 1 and 7", Toast.LENGTH_SHORT).show();
                break;

        }

    }

}
