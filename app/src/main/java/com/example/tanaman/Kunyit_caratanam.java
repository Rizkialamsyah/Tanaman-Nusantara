package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kunyit_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunyit_caratanam);
    }
    public void closekunyit(View view) {
        Intent intent = new Intent(Kunyit_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_kunyit(View view) {
        Intent intent = new Intent( Kunyit_caratanam.this, Kunyit.class);
        startActivity(intent);
    }
    public void olahankunyit(View view) {
        Intent intent = new Intent( Kunyit_caratanam.this, Kunyit_olahan.class);
        startActivity(intent);
    }
}
