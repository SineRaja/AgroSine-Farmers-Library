package com.example.savitri.Vegtables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.savitri.R;

import java.util.ArrayList;
import java.util.List;

public class VegtableBook extends AppCompatActivity {

    RecyclerView vegbookRecycler;
    RecyclerView.Adapter adapter;

    List<VeglibHeplerClass> veglibLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegtable_book);

        vegbookRecycler = findViewById(R.id.vegbook_recycler);

        vegbookRecycler.setHasFixedSize(true);
        vegbookRecycler.setLayoutManager(new GridLayoutManager(this,3));

        veglibLocations = new ArrayList<>();

        veglibLocations.add(new VeglibHeplerClass("ASH Ground",getString(R.string.ashgourdcat),getString(R.string.ashgourddesc),R.drawable.ash_gourd));
        veglibLocations.add(new VeglibHeplerClass("Beetroot",getString(R.string.beetrootcar),getString(R.string.betrootdesc),R.drawable.beetroot));
        veglibLocations.add(new VeglibHeplerClass("Bitter Gourd",getString(R.string.bittergocat),getString(R.string.bittergodesc),R.drawable.bittergourd));
        veglibLocations.add(new VeglibHeplerClass("Tomato",getString(R.string.tomatocat),getString(R.string.tomatodesc),R.drawable.tomato));
        veglibLocations.add(new VeglibHeplerClass("Bottle Gourd",getString(R.string.bottlegroundcat),getString(R.string.bottlegrounddesc),R.drawable.bottelgourd));
        veglibLocations.add(new VeglibHeplerClass("Brinjal",getString(R.string.brinjalcat),getString(R.string.brinjaldesc),R.drawable.brinjal));
        veglibLocations.add(new VeglibHeplerClass("Broccoli",getString(R.string.brocolicat),getString(R.string.brocoliatdesc),R.drawable.broccoli));
        veglibLocations.add(new VeglibHeplerClass("Cabbage",getString(R.string.cababgecat),getString(R.string.cabagedesc),R.drawable.cabbage));
        veglibLocations.add(new VeglibHeplerClass("Carrot",getString(R.string.carrotcat),getString(R.string.carrpotdesc),R.drawable.carrot));
        veglibLocations.add(new VeglibHeplerClass("Capsicum",getString(R.string.capcicumcat),getString(R.string.capcidesc),R.drawable.capsicum));
        veglibLocations.add(new VeglibHeplerClass("Cauliflower",getString(R.string.cauliflowercat),getString(R.string.cauliflowerdesc),R.drawable.cauliflower));
        veglibLocations.add(new VeglibHeplerClass("Celery",getString(R.string.celerycat),getString(R.string.celerydesc),R.drawable.celery));
        veglibLocations.add(new VeglibHeplerClass("Chilly",getString(R.string.chilicat),getString(R.string.chilidesc),R.drawable.chilly));
        veglibLocations.add(new VeglibHeplerClass("Cucumber",getString(R.string.cucumbercat),getString(R.string.cucumberdesc),R.drawable.cucumber));
        veglibLocations.add(new VeglibHeplerClass("Garlic",getString(R.string.garliccat),getString(R.string.garlicdesc),R.drawable.garlic));
        veglibLocations.add(new VeglibHeplerClass("Onion",getString(R.string.onioncat),getString(R.string.oninondesc),R.drawable.onion));
        veglibLocations.add(new VeglibHeplerClass("Lettuce",getString(R.string.leccuttecat),getString(R.string.leccutedesc),R.drawable.lettuce));
        veglibLocations.add(new VeglibHeplerClass("Long Melon",getString(R.string.longmencat),getString(R.string.longmedesc),R.drawable.longmelon));
        veglibLocations.add(new VeglibHeplerClass("Mushroom",getString(R.string.mushromcat),getString(R.string.mushroomdesc),R.drawable.mushroom));
        veglibLocations.add(new VeglibHeplerClass("Okra",getString(R.string.okracat),getString(R.string.okradesc),R.drawable.okra));
        veglibLocations.add(new VeglibHeplerClass("Peas",getString(R.string.peascat),getString(R.string.peardesc),R.drawable.pear));
        veglibLocations.add(new VeglibHeplerClass("Potato",getString(R.string.potatocat),getString(R.string.potatodesc),R.drawable.potato));
        veglibLocations.add(new VeglibHeplerClass("Pumpkin",getString(R.string.pumpkincat),getString(R.string.pumpkindesc),R.drawable.pumpkin));
        veglibLocations.add(new VeglibHeplerClass("Radish",getString(R.string.radishcat),getString(R.string.radishdesc),R.drawable.radish));
        veglibLocations.add(new VeglibHeplerClass("Spinach",getString(R.string.spinachcat),getString(R.string.spindesc),R.drawable.spinach));
        veglibLocations.add(new VeglibHeplerClass("Sponge Gourd",getString(R.string.spongecat),getString(R.string.spongdesc),R.drawable.spongegourg));
        veglibLocations.add(new VeglibHeplerClass("Squash Melon",getString(R.string.squaashcat),getString(R.string.squashdesc),R.drawable.squashmelon));
        veglibLocations.add(new VeglibHeplerClass("Summer Squash",getString(R.string.summersquashcat),getString(R.string.squashdesc),R.drawable.summersquash));
        veglibLocations.add(new VeglibHeplerClass("Sweet Potato",getString(R.string.sweeetpotatcat),getString(R.string.sweetpotatdesc),R.drawable.sweetpotato));
        veglibLocations.add(new VeglibHeplerClass("Turnip",getString(R.string.turnipacat),getString(R.string.turnipdesc),R.drawable.turnip));





        VeglibAdapter adapter = new VeglibAdapter(this,veglibLocations);
        vegbookRecycler.setAdapter(adapter);

    }
}
