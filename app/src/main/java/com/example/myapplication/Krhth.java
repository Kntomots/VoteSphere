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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/merakos_01_crete-heraklion-koulestower_1743x752_logo.webp", "ΝΟΜΟΣ ΗΡΑΚΛΕΙΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%97%CF%81%CE%B1%CE%BA%CE%BB%CE%B5%CE%AF%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_392020450_crete-agnikolaos_1743x752.webp","ΝΟΜΟΣ ΛΑΣΙΘΙΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9B%CE%B1%CF%83%CE%B9%CE%B8%CE%AF%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_1011534294_crete-rethymno_1743x752.webp","ΝΟΜΟΣ ΡΕΘΥΜΝΗΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A1%CE%B5%CE%B8%CF%8D%CE%BC%CE%BD%CE%B7%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_1023179983_crete-chania_1743x752.webp","ΝΟΜΟΣ ΧΑΝΙΩΝ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A7%CE%B1%CE%BD%CE%AF%CF%89%CE%BD"));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
