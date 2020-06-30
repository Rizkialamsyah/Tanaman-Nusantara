package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lengkuas_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lengkuas_olahan);
    }
    public void tanam_lengkuas(View view) {
        Intent intent = new Intent( Lengkuas_olahan.this, Kunyit.class);
        startActivity(intent);
    }
    public void caratanam_lengkuas(View view) {
        Intent intent = new Intent( Lengkuas_olahan.this, Kunyit_caratanam.class);
        startActivity(intent);
    }
    public void closelengkuas(View view) {
        Intent intent = new Intent( Lengkuas_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
