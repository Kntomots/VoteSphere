package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class An_Makedonia_Thraki extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counties);
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("ΑΝΑΤΟΛΙΚΗ ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ");
        ImageView leftIcon = findViewById(R.id.left_icon);
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),periferiakes_enothtes.class);
                startActivity(i);
            }
        });

        RecyclerView recyclerView =findViewById(R.id.recyclerview);
        List<item> items =new ArrayList<item>();
        /*
        items.add(new item("ΝΟΜΟΣ ΞΑΝΘΗΣ", "ntomo", R.drawable.ksanthi, ""));
        items.add(new item("ΝΟΜΟΣ ΔΡΑΜΑΣ","ntomo",R.drawable.drama,""));
        items.add(new item("ΝΟΜΟΣ ΕΒΡΟΥ","ntomo",R.drawable.evros,""));
        items.add(new item("ΝΟΜΟΣ ΚΑΒΑΛΑΣ","ntomo",R.drawable.kavala,""));
        items.add(new item("ΝΟΜΟΣ ΡΟΔΟΠΗΣ","ntomo",R.drawable.rodopis,""));

         */










        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }

}
