package com.example.recycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.model.Zomato;

import java.util.List;
import java.util.zip.Inflater;

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.ZomatoViewHolder> {

    List<Zomato> zomatoList;

    public MycustomAdapter(List<Zomato> zomatoList) {
        this.zomatoList = zomatoList;
    }

    @NonNull
    @Override
    public MycustomAdapter.ZomatoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        return new ZomatoViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MycustomAdapter.ZomatoViewHolder holder, int position) {

        Zomato zomato = zomatoList.get(position);

        holder.name.setText(zomato.getName());
        holder.price.setText(zomato.getPrice());
        holder.rating.setText(zomato.getRating());
        holder.imageView.setImageResource(zomato.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return zomatoList.size();
    }

    public static class ZomatoViewHolder extends RecyclerView.ViewHolder{

        TextView name,rating,price;
        ImageView imageView;

        public ZomatoViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.price);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}