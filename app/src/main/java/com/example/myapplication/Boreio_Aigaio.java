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

public class Boreio_Aigaio extends AppCompatActivity {
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
        items.add(new item("", "","https://www.visitgreece.gr/images/1743x752/jpg/files/i_1162556431_lesvos_1743x752.webp", "ΝΟΜΟΣ ΛΕΣΒΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%9B%CE%AD%CF%83%CE%B2%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/s_115044340_samos-hereon_1743x752.webp","ΝΟΜΟΣ ΣΑΜΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A3%CE%AC%CE%BC%CE%BF%CF%85"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/filippini_33_chios-mavravolia_1743x752.webp","ΝΟΜΟΣ ΧΙΟΥ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%A7%CE%AF%CE%BF%CF%85"));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }

}
