package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        // Create a mapping between button names and activity classes
        HashMap<String, Class<?>> activityMap = new HashMap<>();
        activityMap.put("ΑΝ. ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ", An_Makedonia_Thraki.class);
        activityMap.put("ΚΕΝΤΡΙΚΗ-ΜΑΚΕΔΟΝΙΑ", Attikh.class);
        // Add more mappings as needed

        List<String> buttonNames = generateButtonNames(); // Your list of button names
        ButtonAdapter adapter = new ButtonAdapter(buttonNames, activityMap);
        recyclerView.setAdapter(adapter);
    }

    private List<String> generateButtonNames() {
        List<String> buttonNames = new ArrayList<>();
        // Add your button names here
        buttonNames.add("ΑΝ. ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ");
        buttonNames.add("ΚΕΝΤΡΙΚΗ-ΜΑΚΕΔΟΝΙΑ");
        buttonNames.add("ΑΝ. ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ");
        buttonNames.add("ΚΕΝΤΡΙΚΗ-ΜΑΚΕΔΟΝΙΑ");
        buttonNames.add("ΑΝ. ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ");
        buttonNames.add("ΚΕΝΤΡΙΚΗ-ΜΑΚΕΔΟΝΙΑ");
        buttonNames.add("ΑΝ. ΜΑΚΕΔΟΝΙΑ-ΘΡΑΚΗ");
        buttonNames.add("ΚΕΝΤΡΙΚΗ-ΜΑΚΕΔΟΝΙΑ");
        // Add more button names as needed
        return buttonNames;
    }
}
