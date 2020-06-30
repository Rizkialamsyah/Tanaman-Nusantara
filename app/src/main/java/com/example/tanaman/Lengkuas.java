package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lengkuas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lengkuas);
    }
    public void closelengkuas(View view) {
        Intent intent = new Intent(Lengkuas.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_lengkuas(View view) {
        Intent intent = new Intent(Lengkuas.this, Lengkuas_caratanam.class);
        startActivity(intent);
    }
    public void olahanlengkuas(View view) {
        Intent intent = new Intent(Lengkuas.this, Lengkuas_olahan.class);
        startActivity(intent);
    }
}
