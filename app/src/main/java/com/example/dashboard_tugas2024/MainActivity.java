package com.example.dashboard_tugas2024;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    BangundatarFragment bangundatarFragment = new BangundatarFragment();
    BangunruangFragment bangunruangFragment = new BangunruangFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new BangunruangFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.listProfile){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                } else if (itemId == R.id.listBangundatar){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, bangundatarFragment).commit();
                } else if (itemId == R.id.listBangunruang){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, bangunruangFragment).commit();
                }
                return true; // Return true to indicate the item selection is handled
            }
        });
    }
}