package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class view1 extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_view1);

        wv1 = (WebView)findViewById(R.id.w1);

        //recuperar valores de internet
        String URL = getIntent().getStringExtra("SitioWeb");
        //permitira al user navegar en la app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv1.loadUrl(URL);
    }
    public void Cerrar(View view){
        finish(); //cierra el activity actual
    }
}