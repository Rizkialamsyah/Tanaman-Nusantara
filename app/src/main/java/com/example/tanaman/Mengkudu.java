package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mengkudu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mengkudu);
    }
    public void closemengkudu(View view) {
        Intent intent = new Intent(Mengkudu.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void caratanam_mengkudu(View view) {
        Intent intent = new Intent(Mengkudu.this, Mengkudu_caratanam.class);
        startActivity(intent);
    }
    public void olahanmengkudu(View view) {
        Intent intent = new Intent(Mengkudu.this, Mengkudu_olahan.class);
        startActivity(intent);
    }
}
