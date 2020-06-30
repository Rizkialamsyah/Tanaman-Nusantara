package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Lidahbuaya_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lidahbuaya_caratanam);
    }
    public void closelidahbuaya(View view) {
        Intent intent = new Intent(Lidahbuaya_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_lidahbuaya(View view) {
        Intent intent = new Intent( Lidahbuaya_caratanam.this, Lidahbuaya.class);
        startActivity(intent);
    }
    public void olahanlidahbuaya(View view) {
        Intent intent = new Intent( Lidahbuaya_caratanam.this, Lidahbuaya_olahan.class);
        startActivity(intent);
    }
}
