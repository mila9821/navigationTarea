package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class view extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        //enlazar parte logica y disenio
        et1 = (EditText) findViewById(R.id.txt_web);
    }

    public void Navegar(View view) {
        //se establecen cambios de panatallas o activitys
        Intent i = new Intent(this, view1.class);
        //enviar parametros intent, metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}