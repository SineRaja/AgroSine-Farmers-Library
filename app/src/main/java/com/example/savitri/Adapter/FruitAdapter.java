package com.example.savitri.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savitri.HelperClass.FruitHelperClass;
import com.example.savitri.R;

import java.util.ArrayList;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    ArrayList<FruitHelperClass> fruitLocations;

    public FruitAdapter(ArrayList<FruitHelperClass> fruitLocations) {
        this.fruitLocations = fruitLocations;
    }

    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruits_card_design,parent,false);
        FruitViewHolder fruitViewHolder = new FruitViewHolder(view);
        return fruitViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder holder, int position) {

        FruitHelperClass fruitHelperClass = fruitLocations.get(position);

        holder.image1.setImageResource(fruitHelperClass.getImage1());
        holder.title1.setText(fruitHelperClass.getTitle1());
        holder.disc1.setText(fruitHelperClass.getDisc1());

    }

    @Override
    public int getItemCount() {
        return fruitLocations.size();
    }

    public static class FruitViewHolder extends RecyclerView.ViewHolder{

        ImageView image1;
        TextView title1, disc1;

        public FruitViewHolder(@NonNull View itemView){
            super(itemView);
            image1 = itemView.findViewById(R.id.fruit_image);
            title1 = itemView.findViewById(R.id.fruit_title);
            disc1 = itemView.findViewById(R.id.fruit_desc);
        }

    }
}