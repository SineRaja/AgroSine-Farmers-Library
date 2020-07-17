package com.example.savitri.Pets;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savitri.HelperClass.PetHelperClass;
import com.example.savitri.R;

import java.util.List;

public class PetlibAdapter extends RecyclerView.Adapter<PetlibAdapter.PetlibViewHolder> {

  private Context context;
  private List<PetlibHelperClass> petlibLocations;

    public PetlibAdapter(Context context, List<PetlibHelperClass> petlibLocations) {
        this.context = context;
        this.petlibLocations = petlibLocations;
    }

    @NonNull
    @Override
    public PetlibViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pet_book_design,parent,false);
        PetlibAdapter.PetlibViewHolder petlibViewHolder = new PetlibViewHolder(view);
        return petlibViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PetlibViewHolder holder, final int position) {

        PetlibHelperClass petlibHelperClass = petlibLocations.get(position);

        holder.image5.setImageResource(petlibLocations.get(position).getImage7());
        holder.title5.setText(petlibLocations.get(position).getTitle7());

        holder.petcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent petin = new Intent(context,PetData.class);
                petin.putExtra("petimage",petlibLocations.get(position).getImage7());
                petin.putExtra("pettitle",petlibLocations.get(position).getTitle7());
                petin.putExtra("petcaat",petlibLocations.get(position).getCategory7());
                petin.putExtra("petdiscription",petlibLocations.get(position).getDescription7());
                context.startActivity(petin);

            }
        });


    }

    @Override
    public int getItemCount() {
        return petlibLocations.size();
    }

    public static class PetlibViewHolder extends RecyclerView.ViewHolder{

        ImageView image5;
        TextView title5;
        CardView petcardview;

        public PetlibViewHolder(@NonNull View itemView) {
            super(itemView);

            image5 =itemView.findViewById(R.id.pet_bookimage);
            title5 = itemView.findViewById(R.id.pet_booktitle);
            petcardview = itemView.findViewById(R.id.pet_card);

        }
    }

}
