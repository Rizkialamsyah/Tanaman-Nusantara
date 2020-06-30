package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Temulawak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temulawak);
    }
    public void caratanam_temulawak(View view) {
        Intent intent = new Intent(Temulawak.this, Temulawak_caratanam.class);
        startActivity(intent);
    }
    public void olahan(View view) {
        Intent intent = new Intent( Temulawak.this, Temulawak_olahan.class);
        startActivity(intent);
    }
    public void close(View view) {
        Intent intent = new Intent(Temulawak.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
