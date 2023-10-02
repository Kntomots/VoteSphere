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
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("VoteSphere");


        textView.setText(Html.fromHtml("<b>Οι εκλογές αποτελούν ένα θεμελιώδες κομμάτι του δημοκρατικού συστήματος, αντιπροσωπεύοντας τη φωνή του λαού στη διαμόρφωση της πολιτικής κατεύθυνσης. " +
                "Κάθε εκλογική διαδικασία είναι μια ευκαιρία για τους πολίτες να εκφράσουν τις απόψεις τους και να επιλέξουν τους εκπροσώπους που θα διαχειριστούν τα θέματα της " +
                "κοινότητάς τους. Η ενεργός συμμετοχή στις εκλογές είναι ουσιώδης για τη διατήρηση μιας ζωντανής και λειτουργικής δημοκρατίας. Είναι σημαντικό να ενημερωθούμε και" +
                " να συμμετέχουμε ενεργά, επιλέγοντας υπεύθυνα τους εκπροσώπους μας και συμβάλλοντας στον πολιτικό διάλογο για τη δημιουργία ενός καλύτερου κοινωνικού περιβάλλοντος. " +
                "Οι εκλογές αντιπροσωπεύουν την ευκαιρία για αλλαγή, πρόοδο και ενίσχυση της κοινωνικής συνοχής.</b>"));


        toolbar_title.setHighlightColor(this.getResources().getColor(R.color.gray));
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













    }
}