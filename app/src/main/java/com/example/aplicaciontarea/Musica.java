package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Musica extends AppCompatActivity {

    ImageButton btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        btn1=findViewById(R.id.car1);
        btn2 = findViewById(R.id.car2);
        btn3=findViewById(R.id.car3);
        btn4=findViewById(R.id.car4);

        MediaPlayer mp = MediaPlayer.create(Musica.this, R.raw.musicauno);
        MediaPlayer mp1 = MediaPlayer.create(Musica.this, R.raw.musicados);
        MediaPlayer mp2 = MediaPlayer.create(Musica.this, R.raw.musicatres);
        MediaPlayer mp3 = MediaPlayer.create(Musica.this, R.raw.musicacuatro);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                }else{
                    mp.start();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying()){
                    mp1.pause();
                }else{
                    mp1.start();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                }else {
                    mp2.start();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                }else{
                    mp3.start();
                }
            }
        });
    }
}