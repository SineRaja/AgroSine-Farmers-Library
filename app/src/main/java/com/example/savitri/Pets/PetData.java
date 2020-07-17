package com.example.savitri.Pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savitri.R;

public class PetData extends AppCompatActivity {

    private ImageView petimag;
    private TextView pettt, petdess, petcaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_data);

        petimag = (ImageView) findViewById(R.id.pet_data_image);
        pettt= (TextView) findViewById(R.id.pet_data_title);
        petdess = (TextView) findViewById(R.id.pet_data_discription);
        petcaa = (TextView) findViewById(R.id.pet_data_category);

        Intent pint = getIntent();
        int petimg = pint.getExtras().getInt("petimage");
        String petiti = pint.getExtras().getString("pettitle");
        String petdd = pint.getExtras().getString("petcaat");
        String petcaaa = pint.getExtras().getString("petdiscription");

        petimag.setImageResource(petimg);
        pettt.setText(petiti);
        petdess.setText(petdd);
        petcaa.setText(petcaaa);

    }
}
