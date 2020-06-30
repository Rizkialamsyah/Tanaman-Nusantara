package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lidahbuaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lidahbuaya);
    }
    public void closelidahbuaya(View view) {
        Intent intent = new Intent(Lidahbuaya.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_lidahbuaya(View view) {
        Intent intent = new Intent(Lidahbuaya.this, Lidahbuaya_caratanam.class);
        startActivity(intent);
    }
    public void olahanlidahbuaya(View view) {
        Intent intent = new Intent(Lidahbuaya.this, Lidahbuaya_olahan.class);
        startActivity(intent);
    }
}
