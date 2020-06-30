package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hubungi_kami extends AppCompatActivity {

    public TextView tvLinkify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungi_kami);
    }
    public void home2 (View view) {
        Intent intent = new Intent( Hubungi_kami.this, Activity_home.class);
        startActivity(intent);
    }
}
