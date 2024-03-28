package com.example.dashboard_tugas2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculator_bangun_datar extends AppCompatActivity {

    TextView caltbangundatar, untukhasil;
    EditText number1_1, number1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2_bangun_datar);

        Intent intent = getIntent();
        String shape = intent.getStringExtra("shape2");

        caltbangundatar = findViewById(R.id.Klikhasil);
        number1_1 = findViewById(R.id.txtnumber1);
        number1_2 = findViewById(R.id.txtnumber2);
        untukhasil = findViewById(R.id.hasilnya);

        caltbangundatar.setText(shape);

        Button button1 = findViewById(R.id.Klikhasil);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculateArea2(shape);
            }
        });
    }

    private void calculateArea2(String shape) {
        String inputUser1 = number1_1.getText().toString();
        String inputUser2 = number1_2.getText().toString();

        if (!inputUser1.isEmpty() && !inputUser2.isEmpty()) {
            double number1 = Double.parseDouble(inputUser1);
            double number2 = Double.parseDouble(inputUser2);
            double area = 0;
            switch (shape) {
                case "Persegi Panjang":
                    area = number1 * number2;
                    break;
                case "Segitiga":
                    area = 0.5 * number1 * number2;
                    break;
                case "Belah Ketupat":
                    area = 0.5 * number1 * number2;
                    break;
                case "Jajar Genjang":
                    area = number1 * number2;
                    break;
            }
            String resultArea = String.format("%.2f", area);
            untukhasil.setText("Area: " + resultArea);

        } else {
            untukhasil.setText("Masukkan Angka");
        }
    }
}
