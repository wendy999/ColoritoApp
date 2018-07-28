package com.platzi.coloritoapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.platzi.coloritoapp.Utilidades.DBColorito;

import java.util.ArrayList;

public class InicioActivity extends AppCompatActivity {

    ArrayList<String> listaPuntos;  // SE ME OLVIDA

    DBColorito db; // SE ME OLVIDA

    Button btn_go_play, btn_go_config, btn_go_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        db = new DBColorito(this);

        listaPuntos = new ArrayList<>();  // SE ME OLVIDA

        btn_go_play = (Button) findViewById(R.id.botton_play);
        btn_go_play.setOnClickListener(jugar);
        btn_go_config = (Button) findViewById(R.id.botton_conf);
        btn_go_config.setOnClickListener(config);
        btn_go_score = (Button) findViewById(R.id.botton_score);
        btn_go_score.setOnClickListener(score);

    }

    // BTN JUGAR
    View.OnClickListener jugar = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {

        }
    };

    // BTN CONFIGURACIÓN
    View.OnClickListener config = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {

        }
    };

    // BTN PUNTAGES
    View.OnClickListener score = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {

        }
    };

    // NO DEVOLDER AL SPLASHACTIVITY
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed()
    {
         super.onBackPressed();
         finishAffinity(); // SE ME OLVIDA
    }


}
