package com.example.savitri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.savitri.Chat.ChatBot;
import com.example.savitri.Flowers.FlowerBooks;
import com.example.savitri.Flowers.FlowerlibAdapter;
import com.example.savitri.Flowers.FlowerlibHelperClass;
import com.example.savitri.Fruits.FruitsBook;
import com.example.savitri.Fruits.FrulibAdapter;
import com.example.savitri.Fruits.FrulibHelperClass;
import com.example.savitri.Pets.PetlibAdapter;
import com.example.savitri.Pets.PetlibHelperClass;
import com.example.savitri.Pets.Pets;
import com.example.savitri.Vegtables.VeglibAdapter;
import com.example.savitri.Vegtables.VeglibHeplerClass;
import com.example.savitri.Vegtables.VegtableBook;
import com.example.savitri.Weather.Weather;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView vegtableRecycler;
    RecyclerView fruitsRecycler;
    RecyclerView petRecycler;
    RecyclerView flowerRecyler;
    RecyclerView.Adapter adapter;
    List<VeglibHeplerClass> veglibLocations;
    List<PetlibHelperClass> petlibLocations;
    List<FlowerlibHelperClass> flowerlibLocations;
    List<FrulibHelperClass> frulibLocations;

    ViewFlipper viewFlipper, viewFlipper2;

    TextView vegtable, fruit, flower, pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {R.drawable.view1, R.drawable.view2,R.drawable.view3};
        int images2[] = {R.drawable.vflip1, R.drawable.vflip2,R.drawable.vflip3, R.drawable.vflip4,R.drawable.vflip5};

        viewFlipper = findViewById(R.id.v_flipper1);
        viewFlipper2 = findViewById(R.id.v_flipper2);

      /*  for (int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }*/

      for (int image : images){
          flipperImages(image);
      }

      for (int image2 : images2){
          flipperImages2(image2);
      }




        ImageView vegtable_icon = (ImageView) findViewById(R.id.mini_veg);
        vegtable = findViewById(R.id.mini_veg_title);
        fruit = findViewById(R.id.mini_fru_title);
        flower = findViewById(R.id.mini_flow_title);
        pet = findViewById(R.id.mini_pet_title);

       vegtable_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VegtableBook.class);
                startActivity(i);
            }
        });


        vegtable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),VegtableBook.class);
                startActivity(i2);
            }
        });

        ImageView fruit_icon = (ImageView) findViewById(R.id.mini_fru);
        fruit_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), FruitsBook.class);
                startActivity(i3);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(),FruitsBook.class);
                startActivity(i4);
            }
        });

        ImageView flower_icon = (ImageView) findViewById(R.id.mini_flower);
        flower_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getApplicationContext(), FlowerBooks.class);
                startActivity(i5);
            }
        });

        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(getApplicationContext(),FlowerBooks.class);
                startActivity(i6);
            }
        });

        ImageView pet_icon = (ImageView) findViewById(R.id.mini_pet);
        pet_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(getApplicationContext(), Pets.class);
                startActivity(i7);
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(getApplicationContext(),Pets.class);
                startActivity(i8);
            }
        });

        ImageView weather = (ImageView) findViewById(R.id.weather);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(getApplicationContext(), Weather.class);
                startActivity(i9);
            }
        });

        ImageView user = (ImageView) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(getApplicationContext(),User.class);
                startActivity(i10);
            }
        });

        ImageView sendmsg = (ImageView) findViewById(R.id.sendmsg);
        sendmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(getApplicationContext(), ChatBot.class);
                startActivity(i11);

            }
        });

        ImageView mapindia = (ImageView) findViewById(R.id.mapindia);
        mapindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(getApplicationContext(),Maps.class);
                startActivity(i12);
            }
        });



        vegtableRecycler =findViewById(R.id.vegtable_recycler);
        fruitsRecycler = findViewById(R.id.fruit_recycler);
        petRecycler = findViewById(R.id.pet_recycler);
        flowerRecyler = findViewById(R.id.flower_recycler);

        fruitsRecycler();
        vegtableRecycler();
        petRecycler();
        flowerRecyler();
    }

    public void flipperImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(this,android.R.anim.slide_out_right);

    }

    public void flipperImages2(int images2){
        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(images2);

        viewFlipper2.addView(imageView2);
        viewFlipper2.setFlipInterval(4000);
        viewFlipper2.setAutoStart(true);

        viewFlipper2.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper2.setInAnimation(this,android.R.anim.slide_out_right);
    }


    private void flowerRecyler() {

        flowerRecyler.setHasFixedSize(true);
        flowerRecyler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        flowerlibLocations = new ArrayList<>();


        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.flower,"Rose",getString(R.string.rosecat),getString(R.string.rosedec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.carnation,"Carnation",getString(R.string.carnationcat),getString(R.string.carnationdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.lilies,"Lilies",getString(R.string.liliescat),getString(R.string.liliesdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.chrysanthemum,"Chrysanthemum",getString(R.string.chrysanthemumcat),getString(R.string.chrysanthemumdec)));
        flowerlibLocations.add(new FlowerlibHelperClass(R.drawable.gerbera,"Gerbera",getString(R.string.gerberacat),getString(R.string.gerberadec)));

        FlowerlibAdapter adapter =new FlowerlibAdapter(this,flowerlibLocations);
        flowerRecyler.setAdapter(adapter);

    }

    private void petRecycler() {

        petRecycler.setHasFixedSize(true);
        petRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        petlibLocations = new ArrayList<>();

        petlibLocations.add(new PetlibHelperClass(R.drawable.jprsey,"Jersey",getString(R.string.jerseyca),getString(R.string.jerseyde)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.ongole,"Ongole",getString(R.string.ongolecat),getString(R.string.ongoledec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.goat,"Goat",getString(R.string.goatcat),getString(R.string.goatdec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.germanshepherd,"Germanshepherd",getString(R.string.germanshepherdcat),getString(R.string.germanshepherddec)));
        petlibLocations.add(new PetlibHelperClass(R.drawable.labradors,"Labradors",getString(R.string.labradorcat),getString(R.string.labradordec)));

        PetlibAdapter adapter = new PetlibAdapter(this,petlibLocations);
        petRecycler.setAdapter(adapter);

    }

    private void vegtableRecycler() {

        vegtableRecycler.setHasFixedSize(true);
        vegtableRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

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

        VeglibAdapter adapter = new VeglibAdapter(this,veglibLocations);
        vegtableRecycler.setAdapter(adapter);

    }

    private void fruitsRecycler(){

        fruitsRecycler.setHasFixedSize(true);
        fruitsRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        frulibLocations = new ArrayList<>();

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

        FrulibAdapter adapter =new FrulibAdapter(this,frulibLocations);
        fruitsRecycler.setAdapter(adapter);



    }
}
