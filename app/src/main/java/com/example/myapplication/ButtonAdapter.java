package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.ViewHolder> {

    private List<String> buttonNames;
     HashMap<String, Class<?>> activityMap;

    public ButtonAdapter(List<String> buttonNames,HashMap<String, Class<?>> activityMap) {
        this.buttonNames = buttonNames;
        this.activityMap = activityMap;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_button, parent, false);
        return new ViewHolder(view, activityMap); // Pass buttonNames here
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String buttonName = buttonNames.get(position);
        holder.button.setText(buttonName);
    }

    @Override
    public int getItemCount() {
        return buttonNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button button;
        HashMap<String, Class<?>> activityMap;

        public ViewHolder(@NonNull View itemView, HashMap<String, Class<?>> activityMap) {
            super(itemView);
            this.activityMap = activityMap; // Initialize activityMap

            button = itemView.findViewById(R.id.button_item); // Setting button ID here

            // Set OnClickListener for the button
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button click here
                    int position = getAdapterPosition(); // Get the position of the clicked button
                    if (position != RecyclerView.NO_POSITION) {
                        String clickedButtonName = button.getText().toString(); // Obtain button name from the button's text
                        Class<?> activityClass = activityMap.get(clickedButtonName);
                        if (activityClass != null) {
                            Intent intent = new Intent(itemView.getContext(), activityClass);
                            itemView.getContext().startActivity(intent);
                        }
                    }
                }
            });
        }
    }

}

