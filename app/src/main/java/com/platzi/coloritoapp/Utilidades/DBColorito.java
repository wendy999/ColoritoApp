package com.platzi.coloritoapp.Utilidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

}
