package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<item> items;

    public MyAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        Glide.with(this.context).load(items.get(position).getImage()).into(holder.imageView);

        holder.textView.setText(items.get((position)).getText());
        holder.link = items.get(position).getLink();

        holder.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context,openBroswer.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Add this line to set the flag
               i.putExtra("link",holder.link);
                context.startActivity(i);



            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
