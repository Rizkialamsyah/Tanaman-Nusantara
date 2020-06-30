package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kencur_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kencur_olahan);
    }
    public void tanam_kencur(View view) {
        Intent intent = new Intent( Kencur_olahan.this, Kencur.class);
        startActivity(intent);
    }
    public void caratanam_kencur(View view) {
        Intent intent = new Intent( Kencur_olahan.this, Kencur_caratanam.class);
        startActivity(intent);
    }
    public void closekencur(View view) {
        Intent intent = new Intent( Kencur_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
