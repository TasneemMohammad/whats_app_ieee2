package com.example.whats_app_ieee2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dataBase_whats_app extends SQLiteOpenHelper {

    public static final String DB_NAME =  "chats_db";
    public static final int   DB_VERSION = 1 ;
    public static final String CHAT_TB_NAME   = "chats" ;
    public static final String CHAT_CLN_NAME = "text_name" ;
    public static final String CHAT_CLN_IMAGE  = "image" ;


    public dataBase_whats_app(@Nullable Context context ) {
        super(context,DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + CHAT_TB_NAME + " ( " + CHAT_CLN_NAME  + " TEXT , " + CHAT_CLN_IMAGE  + " INTEGER  )") ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS CHAT_TB_NAME ");
        onCreate(db);
    }

}
