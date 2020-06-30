package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sirih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirih);
    }
    public void closesirih(View view) {
        Intent intent = new Intent(Sirih.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_sirih(View view) {
        Intent intent = new Intent(Sirih.this, Sirih_caratanam.class);
        startActivity(intent);
    }
    public void olahansirih(View view) {
        Intent intent = new Intent(Sirih.this, Sirih_olahan.class);
        startActivity(intent);
    }
}
