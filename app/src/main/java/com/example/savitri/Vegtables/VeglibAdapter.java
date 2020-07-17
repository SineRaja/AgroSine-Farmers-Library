package com.example.savitri.Vegtables;

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

import java.util.ArrayList;
import java.util.List;

public class VeglibAdapter extends RecyclerView.Adapter<VeglibAdapter.VeglibViewHolder> {

    private Context context;
    private List<VeglibHeplerClass> veglibLocations;

    public VeglibAdapter(Context context, List<VeglibHeplerClass> veglibLocations) {
        this.context = context;
        this.veglibLocations = veglibLocations;
    }

    @NonNull
    @Override
    public VeglibViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.veg_book_design,parent,false);
        VeglibAdapter.VeglibViewHolder veglibViewHolder =new VeglibViewHolder(view);
        return veglibViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VeglibViewHolder holder, final int position) {

        VeglibHeplerClass veglibHeplerClass = veglibLocations.get(position);

       holder.image_veg.setImageResource(veglibLocations.get(position).getImage3());
      holder.title_veg.setText(veglibLocations.get(position).getTitle3());

        holder.cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in3 = new Intent(context,VegData.class);
                in3.putExtra("title3",veglibLocations.get(position).getTitle3());
                in3.putExtra("Category3",veglibLocations.get(position).getCategory3());
                in3.putExtra("Descripption3",veglibLocations.get(position).getDiscription3());
                in3.putExtra("Image3",veglibLocations.get(position).getImage3());
                context.startActivity(in3);

            }
        });

    }

    @Override
    public int getItemCount() {
        return veglibLocations.size();
    }

    public static class VeglibViewHolder extends RecyclerView.ViewHolder{

        ImageView image_veg;
        TextView title_veg;
        CardView cardview3;

        public VeglibViewHolder(@NonNull View itemView) {
            super(itemView);

           /* itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent inte = new Intent(v.getContext(),VegData.class);
                    inte.putExtra("title",veglibLocations.get(getAdapterPosition()));
                    v.getContext().startActivity(inte);
                }
            });
*/
            image_veg = itemView.findViewById(R.id.veg_bookimagel);
            title_veg = itemView.findViewById(R.id.veg_booktitle);
            cardview3 = itemView.findViewById(R.id.veg_cardview);
        }
    }

}
