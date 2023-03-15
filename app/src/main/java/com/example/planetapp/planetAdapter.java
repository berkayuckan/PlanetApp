package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class planetAdapter extends RecyclerView.Adapter<planetAdapter.planetViewHolder> {

    private final ArrayList<planetModel> planetLists;

    private final LayoutInflater layoutInflater;
    private PlanetItemClickListener planetItemClickListener;

    public planetAdapter(Context context,ArrayList<planetModel> planetLists, PlanetItemClickListener planetItemClickListener){
        layoutInflater=LayoutInflater.from(context);
        this.planetLists=planetLists;
        this.planetItemClickListener=planetItemClickListener;
    }

    @NonNull
    @Override
    public planetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.planet_row,parent,false);
        return new planetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull planetViewHolder holder, int position) {
        planetModel planetModel=planetLists.get(position);
        holder.planetTitleTextView.setText(planetModel.getPlanetTitle());
        holder.planetBriefTextView.setText(planetModel.getPlanetBrief());
        holder.planetImage.setImageResource(planetModel.getPlanetImage());
        holder.planetDistanceTextView.setText(planetModel.getPlanetDistance());
        holder.planetCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                planetItemClickListener.onItemClicked(planetModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return planetLists.size();
    }


    class planetViewHolder extends RecyclerView.ViewHolder{
        public final ImageView planetImage;
        public final TextView planetTitleTextView;
        public final TextView planetBriefTextView;

        public final TextView planetDistanceTextView;
        public final CardView planetCardView;


        public planetViewHolder(@NonNull View itemView) {
            super(itemView);
            planetImage=itemView.findViewById(R.id.planetImageView);
            planetTitleTextView=itemView.findViewById(R.id.planetTitle);
            planetBriefTextView=itemView.findViewById(R.id.planetBrief);
            planetDistanceTextView=itemView.findViewById(R.id.distance);
            planetCardView=itemView.findViewById(R.id.cardViewPlanet);
        }

    }

    public interface PlanetItemClickListener{
        void onItemClicked(planetModel planetModel);
    }
}
