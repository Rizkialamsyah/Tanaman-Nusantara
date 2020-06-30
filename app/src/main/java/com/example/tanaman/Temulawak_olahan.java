package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Temulawak_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temulawak_olahan);
    }
    public void tanam_temulawak(View view) {
        Intent intent = new Intent( Temulawak_olahan.this, Temulawak.class);
        startActivity(intent);
    }
    public void close(View view) {
        Intent intent = new Intent(Temulawak_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_temulawak(View view) {
        Intent intent = new Intent(Temulawak_olahan.this, Temulawak_caratanam.class);
        startActivity(intent);
    }
}
