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

public class Dytikh_Ellada extends AppCompatActivity {
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
        items.add(new item("", "","https://web-greece.gr/wp-content/uploads/2015/11/nafpaktos_aitoloakarnania3.jpg", "ΝΟΜΟΣ ΑΙΤΩΛΟΑΚΑΡΝΑΝΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%91%CE%B9%CF%84%CF%89%CE%BB%CE%BF%CE%B1%CE%BA%CE%B1%CF%81%CE%BD%CE%B1%CE%BD%CE%AF%CE%B1%CF%82"));
        items.add(new item("","","https://www.visitgreece.gr/images/1743x752/jpg/files/i_477685508_patra_1743x752.webp","ΝΟΜΟΣ ΑΧΑΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%91%CF%87%CE%B1%CE%90%CE%B1%CF%82"));
        items.add(new item("","","https://www.discovergreece.com/sites/default/files/styles/default/public/migrated/the_tranquil_waters_of_kaiafas_lake.jpeg","ΝΟΜΟΣ ΗΛΕΙΑΣ","https://el.wikipedia.org/wiki/%CE%9D%CE%BF%CE%BC%CF%8C%CF%82_%CE%97%CE%BB%CE%B5%CE%AF%CE%B1%CF%82"));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}
