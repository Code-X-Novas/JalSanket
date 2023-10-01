package com.example.jalsanket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intropage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intropage);

        Button clickbutton;

        clickbutton = findViewById(R.id.clickbutton);


        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext;

                iNext = new Intent(Intropage.this, MainActivity3.class);
                startActivity(iNext);
            }
        });
    }
}