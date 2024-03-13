package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class periferiakes_enothtes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periferiakes_enothtes);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Adjust span count as needed

        ImageView leftIcon = findViewById(R.id.left_icon);
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StartMenu.class);
                startActivity(i);
            }
        });

        // Create a mapping between button names and activity classes
        HashMap<String, Class<?>> activityMap = new HashMap<>();
        activityMap.put("ΑΝΑΤΟΛΙΚΗ ΜΑΚΕΔΟΝΙΑ ΘΡΑΚΗ", An_Makedonia_Thraki.class);
       activityMap.put("ΚΕΝΤΡΙΚΗ ΜΑΚΕΔΟΝΙΑ", Kentriki_Makedonia.class);
        activityMap.put("ΔΥΤΙΚΗ ΜΑΚΕΔΟΝΙΑ",Ditiki_Makedonia.class);
        activityMap.put("ΗΠΕΙΡΟΣ", Hpeiros.class);
        activityMap.put("ΘΕΣΣΑΛΙΑ",Thessalia.class);
        activityMap.put("ΙΟΝΙΑ ΝΗΣΙΑ", Ionia_Nhsia.class);
        activityMap.put("ΔΥΤΙΚΗ ΕΛΛΑΔΑ", Dytikh_Ellada.class);
        activityMap.put("ΣΤΕΡΕΑ ΕΛΛΑΔΑ", Sterea_Ellada.class);
        activityMap.put("ΑΤΤΙΚΗ", Attikh.class);
        activityMap.put("ΠΕΛΟΠΟΝΝΗΣΟΣ", Pelloponnhsos.class);
        activityMap.put("ΒΟΡΕΙΟ ΑΙΓΑΙΟ", Boreio_Aigaio.class);
        activityMap.put("ΝΟΤΙΟ ΑΙΓΑΙΟ", Notio_Aigaio.class);
        activityMap.put("ΚΡΗΤΗ", Krhth.class);
        // Add more mappings as needed

        List<String> buttonNames = generateButtonNames(); // Your list of button names
        ButtonAdapter adapter = new ButtonAdapter(buttonNames, activityMap);
        recyclerView.setAdapter(adapter);
    }

    private List<String> generateButtonNames() {
        List<String> buttonNames = new ArrayList<>();
        // Add your button names here
        buttonNames.add("ΑΝΑΤΟΛΙΚΗ ΜΑΚΕΔΟΝΙΑ ΘΡΑΚΗ");
        buttonNames.add("ΚΕΝΤΡΙΚΗ ΜΑΚΕΔΟΝΙΑ");
        buttonNames.add("ΔΥΤΙΚΗ ΜΑΚΕΔΟΝΙΑ");
        buttonNames.add("ΗΠΕΙΡΟΣ");
        buttonNames.add("ΘΕΣΣΑΛΙΑ");
        buttonNames.add("ΙΟΝΙΑ ΝΗΣΙΑ");
        buttonNames.add("ΔΥΤΙΚΗ ΕΛΛΑΔΑ");
        buttonNames.add("ΣΤΕΡΕΑ ΕΛΛΑΔΑ");

        buttonNames.add("ΑΤΤΙΚΗ");
        buttonNames.add("ΠΕΛΟΠΟΝΝΗΣΟΣ");
        buttonNames.add("ΒΟΡΕΙΟ ΑΙΓΑΙΟ");

        buttonNames.add("ΝΟΤΙΟ ΑΙΓΑΙΟ");
        buttonNames.add("ΚΡΗΤΗ");
        // Add more button names as needed
        return buttonNames;
    }
}
