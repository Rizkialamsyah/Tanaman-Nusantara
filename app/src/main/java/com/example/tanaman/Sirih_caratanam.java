package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sirih_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirih_caratanam);
    }
    public void closesirih(View view) {
        Intent intent = new Intent(Sirih_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_sirih(View view) {
        Intent intent = new Intent( Sirih_caratanam.this, Sirih.class);
        startActivity(intent);
    }
    public void olahansirih(View view) {
        Intent intent = new Intent( Sirih_caratanam.this, Sirih_olahan.class);
        startActivity(intent);
    }
}
