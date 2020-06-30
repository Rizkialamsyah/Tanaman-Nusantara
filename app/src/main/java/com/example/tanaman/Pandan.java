package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pandan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pandan);
    }
    public void closepandan(View view) {
        Intent intent = new Intent(Pandan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_pandan(View view) {
        Intent intent = new Intent(Pandan.this, Pandan_caratanam.class);
        startActivity(intent);
    }
    public void olahanpandan(View view) {
        Intent intent = new Intent(Pandan.this, Pandan_olahan.class);
        startActivity(intent);
    }
}
