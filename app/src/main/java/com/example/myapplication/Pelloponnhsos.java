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

public class Pelloponnhsos extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/s_414682924_argolida-epidaurus_1743x752.webp", "ΝΟΜΟΣ ΑΡΓΟΛΙΔΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%91%CF%81%CE%B3%CE%BF%CE%BB%CE%AF%CE%B4%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1855879771_tripoli_1743x752.webp","ΝΟΜΟΣ ΑΡΚΑΔΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%91%CF%81%CE%BA%CE%B1%CE%B4%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_859838370_korinthos_1743x752.webp","ΝΟΜΟΣ ΚΟΡΙΝΘΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%BF%CF%81%CE%B9%CE%BD%CE%B8%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1750x680/jpg/files/i_1034467846_monuments-mystras_1750x680.webp","ΝΟΜΟΣ ΛΑΚΩΝΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9B%CE%B1%CE%BA%CF%89%CE%BD%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1211503387_kalamata_1743x752.webp","ΝΟΜΟΣ ΜΕΣΣΗΝΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9C%CE%B5%CF%83%CF%83%CE%B7%CE%BD%CE%AF%CE%B1%CF%82"));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
