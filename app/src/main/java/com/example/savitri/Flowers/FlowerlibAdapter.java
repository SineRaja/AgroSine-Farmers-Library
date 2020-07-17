package com.example.savitri.Flowers;

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

import java.util.List;


public class FlowerlibAdapter extends RecyclerView.Adapter<FlowerlibAdapter.FlowerlibViewHolder> {

   private Context context;
   private List<FlowerlibHelperClass> flowerlibLocations;

    public FlowerlibAdapter(Context context, List<FlowerlibHelperClass> flowerlibLocations) {
        this.context = context;
        this.flowerlibLocations = flowerlibLocations;
    }

    @NonNull
    @Override
    public FlowerlibViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.flower_book_design,parent,false);
        FlowerlibAdapter.FlowerlibViewHolder flowerlibViewHolder =new FlowerlibViewHolder(view);
        return flowerlibViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerlibViewHolder holder, final int position) {

        FlowerlibHelperClass flowerlibHelperClass= flowerlibLocations.get(position);

       holder.imageflower.setImageResource(flowerlibLocations.get(position).getImage6());
       holder.titleflower.setText(flowerlibLocations.get(position).getTitle6());

       holder.flowercardview.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent flowerintent = new Intent(context, FlowerData.class);
               flowerintent.putExtra("flowerimage",flowerlibLocations.get(position).getImage6());
               flowerintent.putExtra("flowertitle",flowerlibLocations.get(position).getTitle6());
               flowerintent.putExtra("flowercategory",flowerlibLocations.get(position).getCategory6());
               flowerintent.putExtra("flowerdescription",flowerlibLocations.get(position).getDescription6());
               context.startActivity(flowerintent);
           }
       });

    }

    @Override
    public int getItemCount() {
        return flowerlibLocations.size();
    }


    public static class FlowerlibViewHolder extends RecyclerView.ViewHolder{

        ImageView imageflower;
        TextView titleflower;
        CardView flowercardview;

        public FlowerlibViewHolder(@NonNull View itemView) {
            super(itemView);

            imageflower =itemView.findViewById(R.id.flower_bookimage);
            titleflower = itemView.findViewById(R.id.flower_booktitle);
            flowercardview = itemView.findViewById(R.id.flower_card);
        }
    }
}
