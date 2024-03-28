package com.example.dashboard_tugas2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.dashboard_tugas2024.kalkulator_bangunruang.kalkulator_balok;
import com.example.dashboard_tugas2024.kalkulator_bangunruang.kalkulator_kubus;
import com.example.dashboard_tugas2024.kalkulator_bangunruang.Kalkulator_limas;
import com.example.dashboard_tugas2024.kalkulator_bangunruang.Kalkulator_kerucut_set;
import com.example.dashboard_tugas2024.kalkulator_bangunruang.Kalkulator_tabung;

public class BangunruangFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bangunruang, container, false);

        CardView balokCardView = rootView.findViewById(R.id.balok);
        CardView kubusCardView = rootView.findViewById(R.id.kubus);
        CardView limasCardView = rootView.findViewById(R.id.limas);
        CardView kerucutCardView = rootView.findViewById(R.id.kerucut);
        CardView tabungCardView = rootView.findViewById(R.id.tabung);

        balokCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kalkulator_balok.class); // Ganti YourActivity dengan nama aktivitas yang ingin Anda tuju
                startActivity(intent);
            }
        });

        kubusCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kalkulator_kubus.class); // Ganti YourActivity dengan nama aktivitas yang ingin Anda tuju
                startActivity(intent);
            }
        });

        limasCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kalkulator_limas.class); // Ganti YourActivity dengan nama aktivitas yang ingin Anda tuju
                startActivity(intent);
            }
        });

        kerucutCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kalkulator_kerucut_set.class); // Ganti YourActivity dengan nama aktivitas yang ingin Anda tuju
                startActivity(intent);
            }
        });

        tabungCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kalkulator_tabung.class); // Ganti YourActivity dengan nama aktivitas yang ingin Anda tuju
                startActivity(intent);
            }
        });


        return rootView;
    }
}




