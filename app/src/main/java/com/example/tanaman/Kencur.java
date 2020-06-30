package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kencur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kencur);
    }
    public void closekencur(View view) {
        Intent intent = new Intent(Kencur.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_kencur(View view) {
        Intent intent = new Intent(Kencur.this, Kencur_caratanam.class);
        startActivity(intent);
    }
    public void olahankencur(View view) {
        Intent intent = new Intent(Kencur.this, Kencur_olahan.class);
        startActivity(intent);
    }
}
