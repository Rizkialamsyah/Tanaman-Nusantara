package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mengkudu_olahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mengkudu_olahan);
    }
    public void tanam_mengkudu(View view) {
        Intent intent = new Intent( Mengkudu_olahan.this, Mengkudu.class);
        startActivity(intent);
    }
    public void caratanam_mengkudu(View view) {
        Intent intent = new Intent( Mengkudu_olahan.this, Mengkudu_caratanam.class);
        startActivity(intent);
    }
    public void closemengkudu(View view) {
        Intent intent = new Intent( Mengkudu_olahan.this, Daftar_tanaman.class);
        startActivity(intent);
    }
}
