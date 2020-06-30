package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Jahe_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jahe_olahan);
    }
    public void tanam_jahe(View view) {
        Intent intent = new Intent( Jahe_olahan.this, Jahe.class);
        startActivity(intent);
    }
    public void caratanam_jahe(View view) {
        Intent intent = new Intent( Jahe_olahan.this, Jahe_caratanam.class);
        startActivity(intent);
    }
    public void closejahe(View view) {
        Intent intent = new Intent( Jahe_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
