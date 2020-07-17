package com.example.savitri.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savitri.HelperClass.FlowerHelperClass;
import com.example.savitri.R;

import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    ArrayList<FlowerHelperClass> flowerLocations;

    public FlowerAdapter(ArrayList<FlowerHelperClass> flowerLocations){
        this.flowerLocations = flowerLocations;
    }


    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_card_design,parent,false);
        FlowerViewHolder flowerViewHolder = new FlowerViewHolder(view);
        return flowerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {

        FlowerHelperClass flowerHelperClass = flowerLocations.get(position);

        holder.image5.setImageResource(flowerHelperClass.getImage5());
        holder.title5.setText(flowerHelperClass.getTitle5());
        holder.disc5.setText(flowerHelperClass.getDisc5());


    }

    @Override
    public int getItemCount() {
        return flowerLocations.size();
    }

    public static class FlowerViewHolder extends RecyclerView.ViewHolder{

        ImageView image5;
        TextView title5, disc5;

        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);

            image5 = itemView.findViewById(R.id.flower_image);
            title5 =itemView.findViewById(R.id.flower_title);
            disc5 = itemView.findViewById(R.id.flower_disc);
        }
    }

}
