package com.example.latihan5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nama, npm, tempatLahir, tanggalLahir;
    TextView txtHasil;
    Button btntampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen
        nama = findViewById(R.id.nama);
        npm = findViewById(R.id.npm);
        tempatLahir = findViewById(R.id.tempatLahir);
        tanggalLahir = findViewById(R.id.tanggalLahir);
        txtHasil = findViewById(R.id.txtHasil);
        btntampil = findViewById(R.id.btntampil);
    }

    public void TampilNama(View v) {
        String inputNama = nama.getText().toString().trim();
        String inputNPM = npm.getText().toString().trim();
        String inputTempat = tempatLahir.getText().toString().trim();
        String inputTanggal = tanggalLahir.getText().toString().trim();

        if (!inputNama.isEmpty() && !inputNPM.isEmpty() &&
                !inputTempat.isEmpty() && !inputTanggal.isEmpty()) {

            String hasil = "Halo, " + inputNama +
                    "!\nNPM Anda: " + inputNPM +
                    "\nTempat, Tanggal Lahir: " + inputTempat + ", " + inputTanggal;

            txtHasil.setText(hasil);
        } else {
            txtHasil.setText("Silakan lengkapi semua data terlebih dahulu.");
        }
    }
}
