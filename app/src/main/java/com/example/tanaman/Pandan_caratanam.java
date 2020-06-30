package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pandan_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pandan_caratanam);
    }
    public void closepandan(View view) {
        Intent intent = new Intent(Pandan_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_pandan(View view) {
        Intent intent = new Intent( Pandan_caratanam.this, Pandan.class);
        startActivity(intent);
    }
    public void olahanpandan(View view) {
        Intent intent = new Intent( Pandan_caratanam.this, Pandan_olahan.class);
        startActivity(intent);
    }
}
