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

public class Ionia_Nhsia extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_02_zakynthos-agiossostis_1743x752.webp", "ΝΟΜΟΣ ΖΑΚΥΝΘΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%96%CE%B1%CE%BA%CF%8D%CE%BD%CE%B8%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_75292516_kerkyra-aggeorgios_1743x752.webp","ΝΟΜΟΣ ΚΕΡΚΥΡΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%AD%CF%81%CE%BA%CF%85%CF%81%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_03_kefalonia-myirtos_1743x752.webp","ΝΟΜΟΣ ΚΕΦΑΛΛΗΝΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9A%CE%B5%CF%86%CE%B1%CE%BB%CE%BB%CE%B7%CE%BD%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_176100782_lefkada_1743x752.webp","ΝΟΜΟΣ ΛΕΥΚΑΔΟΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9B%CE%B5%CF%85%CE%BA%CE%AC%CE%B4%CE%B1%CF%82"));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
