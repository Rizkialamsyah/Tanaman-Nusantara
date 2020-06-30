package com.example.tanaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Tambah_tanaman extends AppCompatActivity {
    WebView wv;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_tanaman);

        URL = "https://docs.google.com/forms/d/e/1FAIpQLSdPLAjNaE1wOxfrj8IBqp7pDzFCYeRAYbIFc1IPzAscIK_RIA/viewform?usp=sf_link";

        wv= (WebView)findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(URL);
        wv.setWebViewClient(new WebViewClient());
    }
}
