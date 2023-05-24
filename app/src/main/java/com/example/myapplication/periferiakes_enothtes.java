package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class periferiakes_enothtes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periferiakes_enothtes);
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("ΠΕΡΙΦΕΡΕΙΑΚΕΣ ΕΝΟΤΗΤΕΣ");
        ImageView leftIcon=findViewById(R.id.left_icon);
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        });

        String s;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
        b1 =  (findViewById(R.id.an_makedonia));
        b1.setOnClickListener(v -> {

            Intent i = new Intent(getApplicationContext(),An_Makedonia_Thraki.class);
            startActivity(i);
        });
        b2= (findViewById(R.id.button2));
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Kentriki_Makedonia.class);
                startActivity(i);
            }
        });
        b3= (findViewById(R.id.button3));
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Ditiki_Makedonia.class);
                startActivity(i);
            }
        });
        b4= (findViewById(R.id.button4));
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Hpeiros.class);
                startActivity(i);
            }
        });
        b5= (findViewById(R.id.button5));
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Thessalia.class);
                startActivity(i);
            }
        });
        b6= (findViewById(R.id.button6));
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Dytikh_Ellada.class);
                startActivity(i);
            }
        });
        b7= (findViewById(R.id.button7));
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Attikh.class);
                startActivity(i);
            }
        });
        b8= (findViewById(R.id.button8));
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Pelloponnhsos.class);
                startActivity(i);
            }
        });
        b9= (findViewById(R.id.button9));
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Ionia_Nhsia.class);
                startActivity(i);
            }
        });
        b10= (findViewById(R.id.button10));
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Boreio_Aigaio.class);
                startActivity(i);
            }
        });
        b11= (findViewById(R.id.button11));
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Notio_Aigaio.class);
                startActivity(i);
            }
        });
        b12= (findViewById(R.id.button12));
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Krhth.class);
                startActivity(i);
            }
        });
        b13= (findViewById(R.id.button13));
    }
}