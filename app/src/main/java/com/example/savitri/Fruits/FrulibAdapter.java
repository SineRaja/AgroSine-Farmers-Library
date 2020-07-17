package com.example.savitri.Fruits;

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

public class FrulibAdapter extends RecyclerView.Adapter<FrulibAdapter.FrulibViewHolder> {

    private Context context;
   private List<FrulibHelperClass> frulibLoccations;

    public FrulibAdapter(Context context, List<FrulibHelperClass> frulibLoccations) {
        this.context = context;
        this.frulibLoccations = frulibLoccations;
    }

    @NonNull
    @Override
    public FrulibViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fruit_book_design,parent,false);
        FrulibAdapter.FrulibViewHolder frulibViewHolder =new FrulibViewHolder(view);
        return frulibViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FrulibViewHolder holder, final int position) {

        FrulibHelperClass frulibHelperClass = frulibLoccations.get(position);

        holder.image_fru.setImageResource(frulibLoccations.get(position).getImage4());
        holder.title_fru.setText(frulibLoccations.get(position).getTitle4());

        holder.cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,FruitData.class);
                intent.putExtra("image",frulibLoccations.get(position).getImage4());
                intent.putExtra("title",frulibLoccations.get(position).getTitle4());
                intent.putExtra("category",frulibLoccations.get(position).getCategory4());
                intent.putExtra("description",frulibLoccations.get(position).getDescription4());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return frulibLoccations.size();
    }

    public static class FrulibViewHolder extends RecyclerView.ViewHolder{

        ImageView image_fru;
        TextView title_fru;
        CardView cardview4;

        public FrulibViewHolder(@NonNull View itemView) {
            super(itemView);

            image_fru = itemView.findViewById(R.id.fruit_bookimage);
            title_fru = itemView.findViewById(R.id.fruit_booktitle);
            cardview4 = itemView.findViewById(R.id.fru_card);

        }
    }
}
