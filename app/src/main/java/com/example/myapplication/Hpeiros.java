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

public class Hpeiros extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1209505615_arta-bridge_1743x752.webp", "ΝΟΜΟΣ ΑΡΤΑΣ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%86%CF%81%CF%84%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1499080592_syvota-header_1743x752.webp","ΝΟΜΟΣ ΘΕΣΠΡΩΤΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%98%CE%B5%CF%83%CF%80%CF%81%CF%89%CF%84%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_118654084_ioannina_1743x752.webp","ΝΟΜΟΣ ΙΩΑΝΝΙΝΩΝ","https://el.wikipedia.org/wiki/%CE%A0%CE%B5%CF%81%CE%B9%CF%86%CE%B5%CF%81%CE%B5%CE%B9%CE%B1%CE%BA%CE%AE_%CE%95%CE%BD%CF%8C%CF%84%CE%B7%CF%84%CE%B1_%CE%99%CF%89%CE%B1%CE%BD%CE%BD%CE%AF%CE%BD%CF%89%CE%BD"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1117055756_preveza-header_1743x752.webp","ΝΟΜΟΣ ΠΡΕΒΕΖΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A0%CF%81%CE%AD%CE%B2%CE%B5%CE%B6%CE%B1%CF%82"));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
