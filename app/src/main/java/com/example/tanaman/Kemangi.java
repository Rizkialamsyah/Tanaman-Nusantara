package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kemangi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kemangi);
    }
    public void closekemangi(View view) {
        Intent intent = new Intent(Kemangi.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_kemangi(View view) {
        Intent intent = new Intent(Kemangi.this, Kemangi_caratanam.class);
        startActivity(intent);
    }
    public void olahankemangi(View view) {
        Intent intent = new Intent(Kemangi.this, Kemangi_olahan.class);
        startActivity(intent);
    }
}
