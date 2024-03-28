package com.example.dashboard_tugas2024.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard_tugas2024.R;

public class kalkulator_kubus extends AppCompatActivity {
    EditText txtSisi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_kubus);

        txtSisi = findViewById(R.id.txtSisi);
        btnHitung = findViewById(R.id.Klikhasil);
        txtHasil = findViewById(R.id.hasilnya);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
            }
        });
    }

    private void hitungVolumeKubus() {
        String strSisi = txtSisi.getText().toString();

        if (!strSisi.isEmpty()) {
            // Parsing string menjadi tipe data double
            double sisi = Double.parseDouble(strSisi);
            double volume = sisi * sisi * sisi;
            txtHasil.setText("Volume Kubus: " + volume);
        } else {
            // Jika EditText kosong, tampilkan pesan kesalahan
            txtHasil.setText("Masukkan panjang sisi kubus!");
        }
    }
}
