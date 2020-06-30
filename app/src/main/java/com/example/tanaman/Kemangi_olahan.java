package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kemangi_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kemangi_olahan);
    }
    public void tanam_kemangi(View view) {
        Intent intent = new Intent( Kemangi_olahan.this, Kemangi.class);
        startActivity(intent);
    }
    public void caratanam_kemangi(View view) {
        Intent intent = new Intent( Kemangi_olahan.this, Kemangi_caratanam.class);
        startActivity(intent);
    }
    public void closekemangi(View view) {
        Intent intent = new Intent(Kemangi_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
