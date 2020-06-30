package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kencur_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kencur_caratanam);
    }
    public void closekencur(View view) {
        Intent intent = new Intent(Kencur_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_kencur(View view) {
        Intent intent = new Intent( Kencur_caratanam.this, Kencur.class);
        startActivity(intent);
    }
    public void olahankencur(View view) {
        Intent intent = new Intent( Kencur_caratanam.this, Kencur_olahan.class);
        startActivity(intent);
    }
}
