package com.example.dashboard_tugas2024.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard_tugas2024.R;

public class Kalkulator_tabung extends AppCompatActivity {
    EditText txtJariJari, txtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_tabung);

        txtJariJari = findViewById(R.id.txtjarijari);
        txtTinggi = findViewById(R.id.txtTinggi);
        btnHitung = findViewById(R.id.Klikhasil);
        txtHasil = findViewById(R.id.hasilnya);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeTabung();
            }
        });
    }

    private void hitungVolumeTabung() {
        String strJariJari = txtJariJari.getText().toString();
        String strTinggi = txtTinggi.getText().toString();

        if (!strJariJari.isEmpty() && !strTinggi.isEmpty()) {
            double jariJari = Double.parseDouble(strJariJari);
            double tinggi = Double.parseDouble(strTinggi);
            double volume = 3.14 * jariJari * jariJari * tinggi; // Rumus volume tabung
            txtHasil.setText("Volume Tabung: " + volume);
        } else {
            txtHasil.setText("Masukkan nilai jari-jari dan tinggi tabung!");
        }
    }
}


