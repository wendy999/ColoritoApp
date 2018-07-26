package com.platzi.coloritoapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplachActivity extends AppCompatActivity {

    Timer time;
    TimerTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        task = new TimerTask() {
            @Override
            public void run() {
                Intent goBegin =new Intent(SplachActivity.this,InicioActivity.class);
                startActivity(goBegin);
                finish();

            }
        };
        time = new Timer();
        time.schedule(task,2000);

    }
}

