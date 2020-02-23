package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
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

        String val = getIntent().getStringExtra(EXTRA_RECYCLE_NUMBER);
        switch (val) {
            case ("1"):
                imageView.setImageResource(R.drawable.rone);
                leftView.setImageResource(R.drawable.oneone);
                rightView.setImageResource(R.drawable.onetwo);

                textView.setText("Polyethylene terephthalate(PETE/PET) is the material that is used in the packaging of foods and beverages. This material is recyclable!");
                break;

            case "2":
                textView.setText("High Density polyethylene(HDPE) is used in bottles, cups. milk jugs, piping, plastic lumber and many more day to day things. This material is recyclable!");
                imageView.setImageResource(R.drawable.rtwo);
                leftView.setImageResource(R.drawable.twoone);
                rightView.setImageResource(R.drawable.twotwo);
                break;

            case "3":
                imageView.setImageResource(R.drawable.rthree);
                leftView.setImageResource(R.drawable.threeone);
                rightView.setImageResource(R.drawable.threetwo);
                textView.setText("Polyvinyl chloride(PVC) is used in the industry in things like pipes, sides, and flooring. This material is difficult to recycle.");
                break;

            case "4":
                imageView.setImageResource(R.drawable.rfour);
                leftView.setImageResource(R.drawable.fourone);
                rightView.setImageResource(R.drawable.fourtwo);
                textView.setText("Low-density polyethylene(LDPE) is used in a lot of commonplace objects such as plastic bags, six-pack rings, and tubing. This material is recyclable!");
                break;

            case "5":
                imageView.setImageResource(R.drawable.rfive);
                leftView.setImageResource(R.drawable.fiveone);
                rightView.setImageResource(R.drawable.fivetwo);
                textView.setText("Polypropylene(PP) is used in the industry in things like auto parts, industrial fibres, and food containers. This material is recyclable!");
                break;

            case "6":
                imageView.setImageResource(R.drawable.rsix);
                leftView.setImageResource(R.drawable.sixone);
                rightView.setImageResource(R.drawable.sixtwo);
                textView.setText("Polystyrene(PS) is used in lots of daytoday things like plastic utensils, styrofoam, and cafeteria trays. This material is recyclable! But most centers don't accept it");
                break;

            case "7":
                imageView.setImageResource(R.drawable.rseven);
                leftView.setImageResource(R.drawable.sevenone);
                rightView.setImageResource(R.drawable.seventwo);
                textView.setText("This is the name of other plastics(Acrylic, Nylon, Polycarbonate, and Polylactic Acid) which are used in a variety of different objects. Some of the materials inside of the seven category are recyclable. Check to see if it is with your local recycling center.");
                break;

        }

    }

    public void launchMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
