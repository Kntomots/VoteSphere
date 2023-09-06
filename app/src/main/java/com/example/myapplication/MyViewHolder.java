package com.example.myapplication;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    Button buttonView;
    WebView webView;
    TextView nameView,emailView,textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
        textView= itemView.findViewById(R.id.text2);
        buttonView = itemView.findViewById(R.id.showButton);
        webView = itemView.findViewById(R.id.webview);



    }
}
