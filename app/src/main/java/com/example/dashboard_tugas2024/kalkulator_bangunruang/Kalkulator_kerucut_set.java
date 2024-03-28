package com.example.dashboard_tugas2024.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard_tugas2024.R;

public class Kalkulator_kerucut_set extends AppCompatActivity {
    EditText txtJariJari, txtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakulator_kerucut);

        txtJariJari = findViewById(R.id.txtjarijariKerucut);
        txtTinggi = findViewById(R.id.txtTinggikerucut);
        btnHitung = findViewById(R.id.Klikhasil);
        txtHasil = findViewById(R.id.hasilnya);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKerucut();
            }
        });
    }

    private void hitungVolumeKerucut() {
        String strJariJari = txtJariJari.getText().toString();
        String strTinggi = txtTinggi.getText().toString();

        if (!strJariJari.isEmpty() && !strTinggi.isEmpty()) {
            double jariJari = Double.parseDouble(strJariJari);
            double tinggi = Double.parseDouble(strTinggi);
            double volume = (1.0/3.0) * 3.14 * jariJari * jariJari * tinggi; // Rumus volume kerucut
            txtHasil.setText("Volume Kerucut: " + volume);
        } else {
            txtHasil.setText("Masukkan nilai jari-jari dan tinggi kerucut!");
        }
    }
}

