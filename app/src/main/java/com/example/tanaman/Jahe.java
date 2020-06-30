package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Jahe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jahe);
    }
    public void closejahe(View view) {
        Intent intent = new Intent(Jahe.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_jahe(View view) {
        Intent intent = new Intent(Jahe.this, Jahe_caratanam.class);
        startActivity(intent);
    }
    public void olahanjahe(View view) {
        Intent intent = new Intent(Jahe.this, Jahe_olahan.class);
        startActivity(intent);
    }
}
