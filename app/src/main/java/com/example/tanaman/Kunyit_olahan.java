package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kunyit_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunyit__olahan);
    }
    public void tanam_kunyit(View view) {
        Intent intent = new Intent( Kunyit_olahan.this, Kunyit.class);
        startActivity(intent);
    }
    public void caratanam_kunyit(View view) {
        Intent intent = new Intent( Kunyit_olahan.this, Kunyit_caratanam.class);
        startActivity(intent);
    }
    public void closekunyit(View view) {
        Intent intent = new Intent( Kunyit_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
