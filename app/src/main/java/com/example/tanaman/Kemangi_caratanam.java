package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kemangi_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kemangi_caratanam);
    }
    public void closekemangi(View view) {
        Intent intent = new Intent(Kemangi_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_kemangi(View view) {
        Intent intent = new Intent( Kemangi_caratanam.this, Kemangi.class);
        startActivity(intent);
    }
    public void olahankemangi(View view) {
        Intent intent = new Intent( Kemangi_caratanam.this, Kemangi_olahan.class);
        startActivity(intent);
    }
}
