package com.example.savitri.Flowers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.savitri.R;

import java.util.ArrayList;
import java.util.List;

public class FlowerBooks extends AppCompatActivity {

    RecyclerView flowerlibRecycler;
    RecyclerView.Adapter adapter;

    List<FlowerlibHelperClass> flowerlibLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_books);

        flowerlibRecycler = findViewById(R.id.flowerbook_recycler);

        flowerlibLocations = new ArrayList<>();

        flowerlibRecycler.setHasFixedSize(true);
        flowerlibRecycler.setLayoutManager(new GridLayoutManager(this,3));


        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.flower,"Rose",getString(R.string.rosecat),getString(R.string.rosedec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.carnation,"Carnation",getString(R.string.carnationcat),getString(R.string.carnationdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.lilies,"Lilies",getString(R.string.liliescat),getString(R.string.liliesdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.chrysanthemum,"Chrysanthemum",getString(R.string.chrysanthemumcat),getString(R.string.chrysanthemumdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.gerbera,"Gerbera",getString(R.string.gerberacat),getString(R.string.gerberadec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.marigold,"Marigold",getString(R.string.marigoldcat),getString(R.string.marigolddec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.gladiolus,"Gladiolus",getString(R.string.gladioluscat),getString(R.string.gladiolusdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.jasmine,"Jasmine",getString(R.string.jasminecat),getString(R.string.jasminedec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.tuberose,"Tuberose",getString(R.string.tuberosecat),getString(R.string.tuberosedec)));





        FlowerlibAdapter adapter =new FlowerlibAdapter(this,flowerlibLocations);
        flowerlibRecycler.setAdapter(adapter);
    }
}
