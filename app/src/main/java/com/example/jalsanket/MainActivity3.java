package com.example.jalsanket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity3 extends AppCompatActivity {
BottomNavigationView botNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        botNav = findViewById(R.id.botNav);

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id==R.id.Alerts){
                 loadfrag(new Alerts(), false);

                } else if (id==R.id.map) {
                    loadfrag(new Maps(), true);

                } else if (id==R.id.Explore) {
                    loadfrag(new explore(), false);

                } else if (id==R.id.info) {
                    loadfrag(new info(), false);

                }else {
                    loadfrag(new forum(), false);

                }
                return true;
            }
        });

        botNav.setSelectedItemId(R.id.Maps);
    }

    public void loadfrag(Fragment fragment, boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if (flag)
            ft.add(R.id.dispscreen, fragment);
        else
            ft.replace(R.id.dispscreen,fragment);
        ft.commit();
    }
}