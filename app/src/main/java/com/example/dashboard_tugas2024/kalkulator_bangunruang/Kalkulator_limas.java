package com.example.dashboard_tugas2024.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard_tugas2024.R;

public class Kalkulator_limas extends AppCompatActivity {
    EditText txtLuasAlas, txtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_limas);

        txtLuasAlas = findViewById(R.id.txtluasAlaslimas);
        txtTinggi = findViewById(R.id.txtTinggilimas);
        btnHitung = findViewById(R.id.Klikhasil);
        txtHasil = findViewById(R.id.hasilnya);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeLimas();
            }
        });
    }

    private void hitungVolumeLimas() {
        String strLuasAlas = txtLuasAlas.getText().toString();
        String strTinggi = txtTinggi.getText().toString();

        if (!strLuasAlas.isEmpty() && !strTinggi.isEmpty()) {
            double luasAlas = Double.parseDouble(strLuasAlas);
            double tinggi = Double.parseDouble(strTinggi);
            double volume = (luasAlas * tinggi) / 3;
            txtHasil.setText("Volume Limas: " + volume);
        } else {
            txtHasil.setText("Masukkan luas alas dan tinggi limas!");
        }
    }
}
