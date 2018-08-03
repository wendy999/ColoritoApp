package com.platzi.coloritoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JuegoActivity extends AppCompatActivity {

    String [] arregloPalabras,arregloColores;

    private String [] MWords = {"Amarillo","Aul","Verde","Rojo"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);


    }
}