package com.example.savitri.Adapter;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.savitri.HelperClass.PetHelperClass;

import com.example.savitri.R;

import java.util.ArrayList;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder>{

    ArrayList<PetHelperClass> petLocations;

    public PetAdapter(ArrayList<PetHelperClass> petLocations) {
        this.petLocations = petLocations;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pet_card_design,parent,false);
        PetViewHolder petViewHolder = new PetViewHolder(view);
        return petViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {

        PetHelperClass petHelperClass = petLocations.get(position);
        holder.image2.setImageResource(petHelperClass.getImage2());
        holder.title2.setText(petHelperClass.getTitle2());
        holder.disc2.setText(petHelperClass.getDisc2());

    }

    @Override
    public int getItemCount() {
        return petLocations.size();
    }


    public static class PetViewHolder extends RecyclerView.ViewHolder{

        ImageView image2;
        TextView title2, disc2;

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);

            image2 = itemView.findViewById(R.id.pet_image);
            title2 = itemView.findViewById(R.id.pet_title);
            disc2 = itemView.findViewById(R.id.pet_disc);

        }
    }
}
