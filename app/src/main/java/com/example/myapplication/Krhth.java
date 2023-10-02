package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Krhth extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counties);
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
        item item = new item("ΝΟΜΟΣ ΞΑΝΘΗΣ", "ntomo", R.drawable.ksanthi, "ΜΑΚΕΔΟΝΙΑ");
        items.add(item);
        items.add(new item("ΝΟΜΟΣ ΡΟΔΟΠΗΣ","ntomo",R.drawable.rodopis,"ΕΥΡΩΠΗ"));
        items.add(new item("ΝΟΜΟΣ ΔΡΑΜΑΣ","ntomo",R.drawable.drama,""));
        items.add(new item("ΝΟΜΟΣ ΚΑΒΑΛΑΣ","ntomo",R.drawable.kavala,""));
        items.add(new item("ΝΟΜΟΣ ΣΕΡΡΩΝ","ntomo",R.drawable.serres,""));
        items.add(new item("ΝΟΜΟΣ ΘΕΣΣΑΛΟΝΙΚΗΣ","ntomo",R.drawable.thessaloniki,""));
        items.add(new item("ΝΟΜΟΣ ΧΑΛΚΙΔΙΚΗΣ","ntomo",R.drawable.xalkidiki,""));

         */






        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
