package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Serai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serai);
    }
    public void closeserai(View view) {
        Intent intent = new Intent(Serai.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_serai(View view) {
        Intent intent = new Intent(Serai.this, Serai_caratanam.class);
        startActivity(intent);
    }
    public void olahanserai(View view) {
        Intent intent = new Intent(Serai.this, Serai_olahan.class);
        startActivity(intent);
    }
}
