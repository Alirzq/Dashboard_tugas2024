package com.example.dashboard_tugas2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator1_bangundatar extends AppCompatActivity {
    TextView bangunText, hasilView;
    EditText input1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator1_bangundatar);

        bangunText = findViewById(R.id.juducalculate);
        input1 = findViewById(R.id.txtnumber1_1);
        hasilView = findViewById(R.id.hasilnya_1);


        Intent intent = getIntent();
        String shape = intent.getStringExtra("shape1");

        bangunText.setText(shape);

        Button button1 = findViewById(R.id.hasilklik1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea1(shape);
            }
        });
    }

    private void calculateArea1(String shape) {
        String inputUser = input1.getText().toString();
        if (!inputUser.isEmpty()) {
            double number = Double.parseDouble(inputUser);
            double area = 0;
            switch (shape) {
                case "persegi":
                    area = number * number;
                    break;
            }
            String resultArea = String.format("%.2f", area);
            hasilView.setText("Area: " + resultArea);

        } else {
            hasilView.setText("Masukkan Angka");
        }
    }
}