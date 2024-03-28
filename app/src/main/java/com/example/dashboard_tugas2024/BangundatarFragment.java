package com.example.dashboard_tugas2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class BangundatarFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangundatar, container, false);

        CardView persegiPanjangCardView = view.findViewById(R.id.Persegi_Panjang);
        CardView segitigaCardView = view.findViewById(R.id.Segitiga);
        CardView belahketupatCardView = view.findViewById(R.id.belah_ketupat);
        CardView jajargenjangCardView = view.findViewById(R.id.jajar_genjang);
        CardView persegiCardView = view.findViewById(R.id.persegi);


        persegiPanjangCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), calculator_bangun_datar.class);
                intent.putExtra("shape2", "Persegi Panjang");
                startActivity(intent);
            }
        });

        segitigaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), calculator_bangun_datar.class);
                intent.putExtra("shape2", "Segitiga");
                startActivity(intent);
            }
        });

        belahketupatCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), calculator_bangun_datar.class);
                intent.putExtra("shape2", "Belah Ketupat");
                startActivity(intent);
            }
        });

        jajargenjangCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), calculator_bangun_datar.class);
                intent.putExtra("shape2", "Jajar Genjang");
                startActivity(intent);
            }
        });
        persegiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), calculator1_bangundatar.class);
                intent.putExtra("shape1", "persegi");
                startActivity(intent);
            }
        });

        return view;
    }
}