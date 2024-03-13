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

public class Kentriki_Makedonia extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1699982146_veria_1743x752.webp", "ΝΟΜΟΣ ΗΜΑΘΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%97%CE%BC%CE%B1%CE%B8%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_01_thessaloniki-neaparalia_logo-thes_1743x752.webp","ΝΟΜΟΣ ΘΕΣΣΑΛΟΝΙΚΗΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%98%CE%B5%CF%83%CF%83%CE%B1%CE%BB%CE%BF%CE%BD%CE%AF%CE%BA%CE%B7%CF%82"));
        items.add(new item("","","https://centralmacedoniablob.blob.core.windows.net/portal-content/%CE%9B%CE%AF%CE%BC%CE%BD%CE%B7%20%CE%94%CE%BF%CF%8A%CF%81%CE%AC%CE%BD%CE%B7%20%287%29_Doirani%20lake%20%287%29.jpeg","ΝΟΜΟΣ ΚΙΛΚΙΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%B9%CE%BB%CE%BA%CE%AF%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1750x680/jpg/files/merakos_01_edessa-waterfalls_1750x680.webp","ΝΟΜΟΣ ΠΕΛΛΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A0%CE%AD%CE%BB%CE%BB%CE%B1%CF%82"));
        items.add(new item("", "","https://www.visitgreece.gr/images/1750x680/jpg/files/i_1212627031_olympus_1750x680.webp", "ΝΟΜΟΣ ΠΙΕΡΙΑΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B9%CE%B5%CF%81%CE%AF%CE%B1"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_655551238_serres_1743x752.webp","ΝΟΜΟΣ ΣΕΡΡΩΝ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A3%CE%B5%CF%81%CF%81%CF%8E%CE%BD"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_05_halkidiki-portokalibeach_1743x752.webp","ΝΟΜΟΣ ΧΑΛΚΙΔΙΚΗΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A7%CE%B1%CE%BB%CE%BA%CE%B9%CE%B4%CE%B9%CE%BA%CE%AE%CF%82"));










        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
