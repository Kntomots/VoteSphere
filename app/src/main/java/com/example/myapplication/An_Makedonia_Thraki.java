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

        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/s_275321144_drama-agvarvarasprings_1743x752.webp", "ΝΟΜΟΣ ΔΡΑΜΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%94%CF%81%CE%AC%CE%BC%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/872x621/jpg/files/uploads/2019/05/soufli-view.webp","ΝΟΜΟΣ ΕΒΡΟΥ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%88%CE%B2%CF%81%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_899251998_kavala_1743x752.webp","ΝΟΜΟΣ ΚΑΒΑΛΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%B1%CE%B2%CE%AC%CE%BB%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_1131241465_xanthi_1743x752.webp","ΝΟΜΟΣ ΞΑΝΘΗΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9E%CE%AC%CE%BD%CE%B8%CE%B7%CF%82"));
        items.add(new item("","","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/20100923_Kompsatos_Bridge_Polyanthos_Rhodope_Thrace_Greece_Panorama.jpg/600px-20100923_Kompsatos_Bridge_Polyanthos_Rhodope_Thrace_Greece_Panorama.jpg","ΝΟΜΟΣ ΡΟΔΟΠΗΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%A1%CE%BF%CE%B4%CF%8C%CF%80%CE%B7%CF%82"));












        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }

}
