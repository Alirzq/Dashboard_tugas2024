package com.example.dashboard_tugas2024;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public static class MainActivity extends AppCompatActivity {

        BottomNavigationView bottomNavigationView;

        BangundatarFragment bangundatarFragment = new BangundatarFragment();
        BangunruangFragment bangunruangFragment = new BangunruangFragment();
        ProfileFragment profileFragment = new ProfileFragment();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bottomNavigationView = findViewById(R.id.bottom_navigation);

            getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();

            bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem item) {

                    int itemId = item.getItemId();
                    if (itemId == R.id.listProfile){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                    } else if (itemId == R.id.listBangundatar){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,bangundatarFragment).commit();
                    } else if (itemId == R.id.listBangunruang){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,bangunruangFragment).commit();
                    }


                    return false;
                }
            });
        }
    }
}