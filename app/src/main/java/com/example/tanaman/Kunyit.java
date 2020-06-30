package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kunyit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunyit);
    }
    public void closekunyit(View view) {
        Intent intent = new Intent(Kunyit.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_kunyit(View view) {
        Intent intent = new Intent(Kunyit.this, Kunyit_caratanam.class);
        startActivity(intent);
    }
    public void olahankunyit(View view) {
        Intent intent = new Intent(Kunyit.this, Kunyit_olahan.class);
        startActivity(intent);
    }
}
