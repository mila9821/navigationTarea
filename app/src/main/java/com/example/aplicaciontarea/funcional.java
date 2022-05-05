package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class funcional extends AppCompatActivity {

    ImageButton google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcional);
        google = (ImageButton) findViewById(R.id.btngoogle);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google = Uri.parse("https://mhunters.com/es/blog/ejercicios-funcionales-en-casa/");
                Intent intent = new Intent(Intent.ACTION_VIEW, google);
                startActivity(intent);
            }
        });

    }
}