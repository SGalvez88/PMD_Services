package com.example.pmd_services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bontonIniciar = (Button) findViewById(R.id.botonIniciar);
        Button botonDetener = (Button) findViewById(R.id.botonDetener);
        bontonIniciar.setOnClickListener(MainActivity.this);
        botonDetener.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonIniciar:
                startService(new Intent(getApplicationContext(),MiServicio.class));
                break;
            case R.id.botonDetener:
                stopService(new Intent(getApplicationContext(),MiServicio.class));
                break;
        }

    }
}