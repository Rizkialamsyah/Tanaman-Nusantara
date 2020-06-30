package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Serai_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serai_olahan);
    }
    public void tanam_serai(View view) {
        Intent intent = new Intent( Serai_olahan.this, Serai.class);
        startActivity(intent);
    }
    public void caratanam_serai(View view) {
        Intent intent = new Intent( Serai_olahan.this, Serai_caratanam.class);
        startActivity(intent);
    }
    public void closeserai(View view) {
        Intent intent = new Intent( Serai_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
