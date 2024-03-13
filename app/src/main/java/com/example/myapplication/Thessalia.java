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

public class Thessalia extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/skoulas_15_karditsa_1743x752.webp", "ΝΟΜΟΣ ΚΑΡΔΙΤΣΑΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%9A%CE%B1%CF%81%CE%B4%CE%AF%CF%84%CF%83%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_662787526_larisa_1743x752.webp","ΝΟΜΟΣ ΛΑΡΙΣΑΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%9B%CE%AC%CF%81%CE%B9%CF%83%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_001_pelion-makrynitsa_1743x752.webp","ΝΟΜΟΣ ΜΑΓΝΗΣΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9C%CE%B1%CE%B3%CE%BD%CE%B7%CF%83%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1033835188_trikala_1743x752.webp","ΝΟΜΟΣ ΤΡΙΚΑΛΩΝ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A4%CF%81%CE%B9%CE%BA%CE%AC%CE%BB%CF%89%CE%BD"));






        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
