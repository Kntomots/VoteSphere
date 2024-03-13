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

public class Ditiki_Makedonia extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1558584275_grevena-azizagabridge_1743x752.webp", "ΝΟΜΟΣ ΓΡΕΒΕΝΩΝ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%93%CF%81%CE%B5%CE%B2%CE%B5%CE%BD%CF%8E%CE%BD"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_03_kastoria_1743x752.webp","ΝΟΜΟΣ ΚΑΣΤΟΡΙΑΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%9A%CE%B1%CF%83%CF%84%CE%BF%CF%81%CE%B9%CE%AC%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_01_kozani_1743x752.webp","ΝΟΜΟΣ ΚΟΖΑΝΗΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%BF%CE%B6%CE%AC%CE%BD%CE%B7%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1554872486_florina_1743x752.webp","ΝΟΜΟΣ ΦΛΩΡΙΝΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A6%CE%BB%CF%8E%CF%81%CE%B9%CE%BD%CE%B1%CF%82"));







        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
