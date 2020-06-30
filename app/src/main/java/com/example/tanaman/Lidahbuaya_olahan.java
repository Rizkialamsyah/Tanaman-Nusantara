package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lidahbuaya_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lidahbuaya_olahan);
    }
    public void tanam_lidahbuaya(View view) {
        Intent intent = new Intent( Lidahbuaya_olahan.this, Lidahbuaya.class);
        startActivity(intent);
    }
    public void caratanam_lidahbuaya(View view) {
        Intent intent = new Intent( Lidahbuaya_olahan.this, Lidahbuaya_caratanam.class);
        startActivity(intent);
    }
    public void closelidahbuaya(View view) {
        Intent intent = new Intent( Lidahbuaya_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
