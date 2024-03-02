package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mainBtn;
    private ImageView inv;
    private ImageView btr;
    private TextView name;
    private TextView group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBtn = findViewById(R.id.mainBtn);
        name = findViewById(R.id.name);
        group = findViewById(R.id.group);
        inv = findViewById(R.id.inv);
        btr = findViewById(R.id.btr);


        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getVisibility() == View.VISIBLE && group.getVisibility() == View.VISIBLE) {
                    name.setVisibility(View.INVISIBLE);
                    group.setVisibility(View.INVISIBLE);
                }
                else {
                    name.setVisibility(View.VISIBLE);
                    group.setVisibility(View.VISIBLE);
                }
            }
        });

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btr.getVisibility() == View.VISIBLE) {
                    btr.setVisibility(View.INVISIBLE);
                }
                else {
                    btr.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}