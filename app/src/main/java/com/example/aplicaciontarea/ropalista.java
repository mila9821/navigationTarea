package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ropalista extends AppCompatActivity {
    Button ropa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ropalista);

        ropa = findViewById(R.id.comprar);
    }

    public void comprar(View view){
        Intent intent = new Intent(ropalista.this, ropa.class);
        startActivity(intent);
        finish();
    }
}