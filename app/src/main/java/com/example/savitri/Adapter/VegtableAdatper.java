package com.example.savitri.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savitri.R;
import com.example.savitri.HelperClass.VegtableHelperClass;
import com.example.savitri.Vegtables.VegData;

import java.util.ArrayList;

public class VegtableAdatper extends RecyclerView.Adapter<VegtableAdatper.VegtableViewHolder> {


    private Context context;
    ArrayList<VegtableHelperClass> vegtableLocations;

    public VegtableAdatper(Context context, ArrayList<VegtableHelperClass> vegtableLocations) {
        this.context = context;
        this.vegtableLocations = vegtableLocations;

    }

    @NonNull
    @Override
    public VegtableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vegtable_card_design, parent, false);
        VegtableViewHolder vegtableViewHolder = new VegtableViewHolder(view);

        return vegtableViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VegtableViewHolder holder, final int position) {

        VegtableHelperClass vegtableHelperClass = vegtableLocations.get(position);

        holder.image.setImageResource(vegtableHelperClass.getImage());
        holder.title.setText(vegtableHelperClass.getTitle());
        holder.desc.setText(vegtableHelperClass.getDesc());

        holder.cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3= new Intent(context, VegData.class);
                in3.putExtra("title3",vegtableLocations.get(position).getTitle());
                in3.putExtra("description3",vegtableLocations.get(position).getDesc());
                in3.putExtra("image3",vegtableLocations.get(position).getImage());
                context.startActivity(in3);
            }
        });

    }

    @Override
    public int getItemCount() {
        return vegtableLocations.size();
    }

    public static class VegtableViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, desc;
        CardView cardview3;

        public VegtableViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.vegtable_image);
            title = itemView.findViewById(R.id.vegtable_title);
            desc = itemView.findViewById(R.id.vegtable_disc);
            cardview3 = itemView.findViewById(R.id.veg_cardview);

        }
    }



}
