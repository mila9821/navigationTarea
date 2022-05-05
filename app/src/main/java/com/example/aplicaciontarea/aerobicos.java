package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aerobicos extends AppCompatActivity {

    ImageButton video1, video2, video3, video4, video5, video6, video7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobicos);

        video1=(ImageButton) findViewById(R.id.btnvideo);
        video2=(ImageButton) findViewById(R.id.btnvideo1);
        video3=(ImageButton) findViewById(R.id.btnvideo2);
        video4=(ImageButton) findViewById(R.id.btnvideo3);
        video5=(ImageButton) findViewById(R.id.btnvideo4);
        video6=(ImageButton) findViewById(R.id.btnvideo5);
        video7=(ImageButton) findViewById(R.id.btnvideo6);

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=7bEnCKxzTIg&t=943s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=EqXCb214Atw&t=649s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=xMKfzqQqwF4&t=500s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=v8yc6MLMJIE&t=427s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=29p3nTAqV7Y");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=Qbu7MMOR2cM&t=370s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
        video7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri video = Uri.parse("https://www.youtube.com/watch?v=t_NjWl1a1Ls&t=1054s");
                Intent intent = new Intent(Intent.ACTION_VIEW,video);
                startActivity(intent);
            }
        });
    }
}