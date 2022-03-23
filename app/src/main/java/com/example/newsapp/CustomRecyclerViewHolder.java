package com.example.newsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView text_title, text_source;
    ImageView img_Headline;
    CardView cardView;

    public CustomRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        text_title = itemView.findViewById(R.id.title);
        text_source = itemView.findViewById(R.id.source);
        img_Headline = itemView.findViewById(R.id.img_headline);
        cardView = itemView.findViewById(R.id.card_container);
    }

}
