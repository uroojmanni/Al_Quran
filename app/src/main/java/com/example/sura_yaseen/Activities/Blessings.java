package com.example.sura_yaseen.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.sura_yaseen.R;
import com.example.sura_yaseen.fragments.kahf_frag;
import com.example.sura_yaseen.fragments.mulk_frag;
import com.example.sura_yaseen.fragments.rahman_frag;
import com.example.sura_yaseen.fragments.waqia_frag;
import com.example.sura_yaseen.fragments.yaseen_farg;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Blessings extends AppCompatActivity {



    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessings);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation1);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment selectedFragment = null;

                // Check the selected item ID using if-else conditions
                int itemId = item.getItemId();
                if (itemId == R.id.menu_yaseen) {
                    selectedFragment = new yaseen_farg();
                } else if (itemId == R.id.menu_rahman) {
                    selectedFragment = new rahman_frag();

                } else if (itemId == R.id.menu_mulk) {
                    selectedFragment = new mulk_frag();
                } else if (itemId == R.id.menu_khaf) {
                    selectedFragment = new kahf_frag();
                } else if (itemId == R.id.menu_waqia) {
                    selectedFragment = new waqia_frag();
                }

                // Replace the fragment in the fragment container
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container1, selectedFragment)
                            .commit();
                }
                return true;
            }
        });

        // Set the default fragment when the activity is created
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new yaseen_farg())
                    .commit();
        }
    }
}