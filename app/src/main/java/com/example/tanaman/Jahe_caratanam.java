package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Jahe_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jahe_caratanam);
    }
    public void closejahe(View view) {
        Intent intent = new Intent(Jahe_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_jahe(View view) {
        Intent intent = new Intent( Jahe_caratanam.this, Jahe.class);
        startActivity(intent);
    }
    public void olahanjahe(View view) {
        Intent intent = new Intent( Jahe_caratanam.this, Jahe_olahan.class);
        startActivity(intent);
    }
}
