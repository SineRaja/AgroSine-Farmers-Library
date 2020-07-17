package com.example.savitri.Fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savitri.R;

public class FruitData extends AppCompatActivity {

    private ImageView imgfruit;
    private TextView txttitle, txtcategory, txtdescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_data);

        imgfruit = (ImageView)findViewById(R.id.fru_image);
        txttitle = (TextView) findViewById(R.id.fru_title);
        txtcategory = (TextView) findViewById(R.id.fru_category);
        txtdescription = (TextView) findViewById(R.id.fru_discription);

        Intent intent1 = getIntent();
        int image = intent1.getExtras().getInt("image");
        String title = intent1.getExtras().getString("title");
        String category = intent1.getExtras().getString("category");
        String description = intent1.getExtras().getString("description");

        imgfruit.setImageResource(image);
        txttitle.setText(title);
        txtcategory.setText(category);
        txtdescription.setText(description);


    }
}
