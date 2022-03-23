package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapp.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class Details extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView text_title, text_author, text_time, text_detail, text_content;
    ImageView img_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        text_title = findViewById(R.id.detail_title);
        text_author = findViewById(R.id.detail_author);
        text_time = findViewById(R.id.detail_time);
        text_detail = findViewById(R.id.detail_detail);
        text_content = findViewById(R.id.detail_content);
        img_detail = findViewById(R.id.img_details);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        text_time.setText(headlines.getTitle());
        text_author.setText(headlines.getAuthor());
        text_time.setText(headlines.getPublishedAt());
        text_detail.setText(headlines.getDescription());
        text_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_detail);
    }
}