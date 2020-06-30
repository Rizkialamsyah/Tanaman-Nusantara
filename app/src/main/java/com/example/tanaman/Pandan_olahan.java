package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pandan_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pandan_olahan);
    }
    public void tanam_pandan(View view) {
        Intent intent = new Intent( Pandan_olahan.this, Pandan.class);
        startActivity(intent);
    }
    public void caratanam_pandan(View view) {
        Intent intent = new Intent( Pandan_olahan.this, Pandan_caratanam.class);
        startActivity(intent);
    }
    public void closepandan(View view) {
        Intent intent = new Intent( Pandan_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
