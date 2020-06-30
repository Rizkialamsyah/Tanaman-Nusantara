package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mengkudu_caratanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mengkudu_caratanam);
    }
    public void closemengkudu(View view) {
        Intent intent = new Intent(Mengkudu_caratanam.this, Daftar_tanaman.class);
        startActivity(intent);
    }
    public void tanam_mengkudu(View view) {
        Intent intent = new Intent( Mengkudu_caratanam.this, Mengkudu.class);
        startActivity(intent);
    }
    public void olahanmengkudu(View view) {
        Intent intent = new Intent( Mengkudu_caratanam.this, Mengkudu_olahan.class);
        startActivity(intent);
    }
}
