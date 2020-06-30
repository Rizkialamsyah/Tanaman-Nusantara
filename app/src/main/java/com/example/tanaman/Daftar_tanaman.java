package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Daftar_tanaman extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tanaman);
    }

    public void home(View view) {
        Intent intent = new Intent( Daftar_tanaman.this, Activity_home.class);
        startActivity(intent);
    }
    public void temulawak(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Temulawak.class);
        startActivity(intent);
    }
    public void kunyit(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Kunyit.class);
        startActivity(intent);
    }
    public void lengkuas(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Lengkuas.class);
        startActivity(intent);
    }
    public void jahe(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Jahe.class);
        startActivity(intent);
    }
    public void kencur(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Kencur.class);
        startActivity(intent);
    }
    public void serai(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Serai.class);
        startActivity(intent);
    }
    public void sirih(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Sirih.class);
        startActivity(intent);
    }
    public void pandan(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Pandan.class);
        startActivity(intent);
    }
    public void kemangi(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Kemangi.class);
        startActivity(intent);
    }
    public void mengkudu(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Mengkudu.class);
        startActivity(intent);
    }
    public void lidahbuaya(View view) {
        Intent intent = new Intent(Daftar_tanaman.this, Lidahbuaya.class);
        startActivity(intent);
    }

}
