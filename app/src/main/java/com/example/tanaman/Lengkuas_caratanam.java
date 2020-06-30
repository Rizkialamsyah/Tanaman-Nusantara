package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lengkuas_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lengkuas_caratanam);
    }
    public void closelengkuas(View view) {
        Intent intent = new Intent(Lengkuas_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_lengkuas(View view) {
        Intent intent = new Intent( Lengkuas_caratanam.this, Lengkuas.class);
        startActivity(intent);
    }
    public void olahanlengkuas(View view) {
        Intent intent = new Intent( Lengkuas_caratanam.this, Lengkuas_olahan.class);
        startActivity(intent);
    }
}
