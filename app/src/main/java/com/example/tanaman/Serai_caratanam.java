package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Serai_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serai_caratanam);
    }
    public void closeserai(View view) {
        Intent intent = new Intent(Serai_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_serai(View view) {
        Intent intent = new Intent( Serai_caratanam.this, Serai.class);
        startActivity(intent);
    }
    public void olahanserai(View view) {
        Intent intent = new Intent( Serai_caratanam.this, Serai_olahan.class);
        startActivity(intent);
    }
}
