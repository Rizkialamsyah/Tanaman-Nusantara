package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sirih_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirih_olahan);
    }
    public void tanam_sirih(View view) {
        Intent intent = new Intent( Sirih_olahan.this, Sirih.class);
        startActivity(intent);
    }
    public void caratanam_sirih(View view) {
        Intent intent = new Intent( Sirih_olahan.this, Sirih_caratanam.class);
        startActivity(intent);
    }
    public void closesirih(View view) {
        Intent intent = new Intent( Sirih_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
