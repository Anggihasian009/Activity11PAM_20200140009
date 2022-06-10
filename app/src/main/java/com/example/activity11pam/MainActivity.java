package com.example.activity11pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnTambah, bLihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**
 * Anggi Hasian Nugraha Munthe_20200140009
 */
        btnTambah = findViewById(R.id.Btntmbh);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TambahData.class);
                startActivity(i);

            }
        });

        bLihat = findViewById(R.id.Btnlihat);

        bLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (LihatBarang.getActIntent(MainActivity.this));
                startActivity(i);}
        });

    }
}