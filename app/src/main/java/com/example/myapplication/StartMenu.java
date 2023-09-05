package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StartMenu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        TextView textView = findViewById(R.id.welcome_text_view);
        ImageView leftIcon = findViewById(R.id.left_icon);
        leftIcon.setVisibility(View.INVISIBLE);
        ImageView rightIcon = findViewById(R.id.right_icon);
        Button map_button = findViewById(R.id.map_button);
        Button testButton = findViewById(R.id.test_button);
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("VoteSphere");
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),periferiakes_enothtes.class);
                startActivity(i);
            }
        });
        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StartMenu.this,"right icon",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),periferiakes_enothtes.class);
                startActivity(i);
            }
        });
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapInterface.class);
                startActivity(i);
            }
        });
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity4.class);
            }
        });












    }
}