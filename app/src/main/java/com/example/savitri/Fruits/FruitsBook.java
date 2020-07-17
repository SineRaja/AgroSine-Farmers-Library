package com.example.savitri.Fruits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.savitri.Adapter.FruitAdapter;
import com.example.savitri.R;

import java.util.ArrayList;
import java.util.List;

public class FruitsBook extends AppCompatActivity {

    RecyclerView frubookRecycler;
    RecyclerView.Adapter adapter;

    List<FrulibHelperClass> frulibLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_book);

        frubookRecycler = findViewById(R.id.fruitbook_recycler);

        frulibLocations = new ArrayList<>();

        frubookRecycler.setHasFixedSize(true);
        frubookRecycler.setLayoutManager(new GridLayoutManager(this,3));

        frulibLocations.add(new FrulibHelperClass(R.drawable.apple,"Apple",getString(R.string.applecategory),getString(R.string.appledesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.avocada,"Avocado",getString(R.string.avacodacategory),getString(R.string.avocadodescr)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.banana,"Banana",getString(R.string.bananacate),getString(R.string.bananadesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.blacberry,"Blackberries",getString(R.string.blackcat),getString(R.string.blackdesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.blueberry,"Blueberries",getString(R.string.bluecat),getString(R.string.bludesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.cantal,"Cantaloupe",getString(R.string.cherimoyacat),getString(R.string.cherimoyadesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.cherry,"Cherries",getString(R.string.cherrycat),getString(R.string.cherrydesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.cocunut,"Coconut",getString(R.string.coconutcat),getString(R.string.coconutdesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.custard,"Custard-Apple",getString(R.string.custordapplcat),getString(R.string.custordappledesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.goosebbeery,"Gooseberries",getString(R.string.gooseberrycart),getString(R.string.gooseberrydesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.grapes,"Grapes",getString(R.string.grapeescat),getString(R.string.grapeesdesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.gauva,"Guava",getString(R.string.guavacat),getString(R.string.guavadesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.jackfr,"Jackfruit",getString(R.string.jackfruitcat),getString(R.string.jackfruitdesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.lemon,"Lemon",getString(R.string.lemoncat),getString(R.string.lemondesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.mango,"Mango",getString(R.string.mangocat),getString(R.string.mangodesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.orange,"Orange",getString(R.string.orangecat),getString(R.string.mangodesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.papaya,"Papaya",getString(R.string.papayacat),getString(R.string.papayadesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.pear,"Pear",getString(R.string.pearcat),getString(R.string.peardesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.pineapple,"Pineapple",getString(R.string.pineapplecat),getString(R.string.pineappledesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.strawberry,"Strawberries",getString(R.string.strawberrycat),getString(R.string.strawberydesc)));
        frulibLocations.add(new FrulibHelperClass(R.drawable.watermelon,"Watermelon",getString(R.string.watermeloncat),getString(R.string.watermelondesc)));





        FrulibAdapter adapter =new FrulibAdapter(this,frulibLocations);
        frubookRecycler.setAdapter(adapter);

    }
}
