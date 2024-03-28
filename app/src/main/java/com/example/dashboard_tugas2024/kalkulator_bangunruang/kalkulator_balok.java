package com.example.dashboard_tugas2024.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard_tugas2024.R;

public class kalkulator_balok extends AppCompatActivity {
    EditText txtPanjang, txtLebar, txtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_balok);

        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtTinggi = findViewById(R.id.txtTinggi);
        btnHitung = findViewById(R.id.Klikhasil);
        txtHasil = findViewById(R.id.hasilnya);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
            }
        });
    }

    private void hitungVolumeBalok() {
        String strPanjang = txtPanjang.getText().toString();
        String strLebar = txtLebar.getText().toString();
        String strTinggi = txtTinggi.getText().toString();

        if (!strPanjang.isEmpty() && !strLebar.isEmpty() && !strTinggi.isEmpty()) {
            double panjang = Double.parseDouble(strPanjang);
            double lebar = Double.parseDouble(strLebar);
            double tinggi = Double.parseDouble(strTinggi);
            double volume = panjang * lebar * tinggi;
            txtHasil.setText("Volume Balok: " + volume);
        } else {
            txtHasil.setText("Masukkan panjang, lebar, dan tinggi balok!");
        }
    }
}
