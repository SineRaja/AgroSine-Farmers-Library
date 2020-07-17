package com.example.savitri.Pets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.savitri.R;

import java.util.ArrayList;
import java.util.List;

public class Pets extends AppCompatActivity {

    RecyclerView petlibRecycler;
    RecyclerView.Adapter adapter;
    List<PetlibHelperClass> petlibLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);

        petlibRecycler =findViewById(R.id.petbook_recycler);


        petlibRecycler.setHasFixedSize(true);
        petlibRecycler.setLayoutManager(new GridLayoutManager(this,3));

        petlibLocations = new ArrayList<>();


        petlibLocations.add(new PetlibHelperClass(R.drawable.jprsey,"Jersey",getString(R.string.jerseyca),getString(R.string.jerseyde)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.ongole,"Ongole",getString(R.string.ongolecat),getString(R.string.ongoledec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.goat,"Goat",getString(R.string.goatcat),getString(R.string.goatdec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.germanshepherd,"Germanshepherd",getString(R.string.germanshepherdcat),getString(R.string.germanshepherddec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.labradors,"Labradors",getString(R.string.labradorcat),getString(R.string.labradordec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.goldenritriver,"Goldenritriver",getString(R.string.goldenretrievercat),getString(R.string.goldenretrieverdec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.dalmatian,"Dalmatian",getString(R.string.dalmatiancat),getString(R.string.dalmatiandec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.labradors,"Labradors",getString(R.string.labradorcat),getString(R.string.labradordec)));


        PetlibAdapter adapter = new PetlibAdapter(this,petlibLocations);
        petlibRecycler.setAdapter(adapter);

    }
}
