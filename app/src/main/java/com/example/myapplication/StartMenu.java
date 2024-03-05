package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;


public class StartMenu extends AppCompatActivity {

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String imageUrl = "https://example.com/your_image.jpg";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        TextView textView = findViewById(R.id.welcome_text_view);
        ImageView leftIcon = findViewById(R.id.left_icon);
        Button list_button = findViewById(R.id.list_button);
        leftIcon.setVisibility(View.INVISIBLE);
        Button map_button = findViewById(R.id.map_button);
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("VoteSphere");
        //Picasso.get().load(imageUrl).into(imageView);



        toolbar_title.setHighlightColor(this.getResources().getColor(R.color.gray));
        list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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













    }
}