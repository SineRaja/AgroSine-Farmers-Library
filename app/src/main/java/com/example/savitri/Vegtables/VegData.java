package com.example.savitri.Vegtables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.nfc.TagLostException;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savitri.R;

public class VegData extends AppCompatActivity {

    private ImageView vegimage;
    private TextView vegtitle, vegdiscription, vegcategory;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_data);

        vegimage = (ImageView) findViewById(R.id.veg_data_image);
        vegtitle = (TextView) findViewById(R.id.veg_data_title);
        vegdiscription =(TextView) findViewById(R.id.veg_data_description);
        vegcategory = (TextView) findViewById(R.id.veg_data_category);

     /*   Intent intent1 = getIntent();
        String title = intent1.getExtras().getString("Title");
        String description = intent1.getExtras().getString("Description");
        String category = intent1.getExtras().getString("Category");
        int image = intent1.getExtras().getInt("image");

        image3.setImageResource(Image);*/

     Intent intent = getIntent();
     String vegti = intent.getExtras().getString("title3");
     String vegdesc = intent.getExtras().getString("Descripption3");
     String vegcat = intent.getExtras().getString("Category3");
     int vegima = intent.getExtras().getInt("Image3");

     vegimage.setImageResource(vegima);
     vegtitle.setText(vegti);
     vegdiscription.setText(vegdesc);
     vegcategory.setText(vegcat);

    }
}
