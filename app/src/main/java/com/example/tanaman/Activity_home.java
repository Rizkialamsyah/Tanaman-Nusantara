package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void daftar_tanaman(View view) {
        Intent intent = new Intent( Activity_home.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tambah_tanaman(View view) {
        Intent intent = new Intent( Activity_home.this, Tambah_tanaman.class);
        startActivity(intent);
    }
    public void hubungi_kami(View view) {
        Intent intent = new Intent( Activity_home.this, Hubungi_kami.class);
        startActivity(intent);
    }
}
