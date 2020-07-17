package com.example.savitri.Flowers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savitri.R;

public class FlowerData extends AppCompatActivity {

    private ImageView flowerim;
    private TextView flowertit, flowercat, flowerdes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_data);

        flowerim =(ImageView) findViewById(R.id.flower_data_image);
        flowertit = (TextView) findViewById(R.id.flower_data_title);
        flowercat =(TextView) findViewById(R.id.flower_data_category);
        flowerdes = (TextView) findViewById(R.id.flower_data_discription);

        Intent floint = getIntent();
        int flowimage = floint.getExtras().getInt("flowerimage");
        String flowtitl = floint.getExtras().getString("flowertitle");
        String flowcat = floint.getExtras().getString("flowercategory");
        String flowdes = floint.getExtras().getString("flowerdescription");

        flowerim.setImageResource(flowimage);
        flowertit.setText(flowtitl);
        flowercat.setText(flowcat);
        flowerdes.setText(flowdes);



    }
}
