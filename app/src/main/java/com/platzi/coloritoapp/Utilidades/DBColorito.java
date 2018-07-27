package com.platzi.coloritoapp.Utilidades;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBColorito extends SQLiteOpenHelper
{
    public static final String BD_ATOS ="db_colorito";
    public static final String TABLA_COLORITO ="puntaje_colorito";
    public static final String ID_COLORITO ="id_colorito";
    public static final String PUNTAJE="puntaje";
    public static final String PUNTAJE_INCORRECTO="puntaje_incorrecto";

    public static final String SQL = " CREATE TABLE "+TABLA_COLORITO+" ( "+ID_COLORITO+" INTEGER PRIMARY KEY "+PUNTAJE+" INTEGER "+PUNTAJE_INCORRECTO+" INTEGER )";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public DBColorito(Context context)
    {
        super(context,BD_ATOS,null,1);
    }

    SQLiteDatabase db;

    public void openBD(boolean write)
    {
        if (write)
        {
            this.getWritableDatabase();
        }
        else
        {
            this.getWritableDatabase();
        }
    }

    public void closDB()
    {
        db.close();
    }

    public long insertScore(int score, int scoreError)
    {
        ContentValues insertt = new ContentValues();
        insertt.put(PUNTAJE,score);
        insertt.put(PUNTAJE_INCORRECTO,scoreError);

        long insert = db.insert(TABLA_COLORITO,null,insertt);
        closDB();
        return insert;
    }


    public ArrayList<String> listScore()
    {
        ArrayList<String> Scores = new ArrayList<String>();

        int Score;
        int ScoreError;

        String query = "SELECT * FROM"+BD_ATOS+" ORDER BY "+ PUNTAJE+" DESC LIMIT 4 ";
        Cursor cursor = db.rawQuery(query,null);

        if (cursor.moveToFirst() && cursor !=null)
        {
            int contador = 0;
            do {
                contador++;
                Score = cursor.getInt(1);
                ScoreError = cursor.getInt(2);
                Scores.add("CORRECTOS: " + Score + " INCORRECTOS: " + ScoreError);
            }
            while (cursor.moveToNext());
        }
        closDB();
        cursor.close();
        return Scores;
    }
}