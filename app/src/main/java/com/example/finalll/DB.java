package com.example.finalll;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DB extends SQLiteOpenHelper {
    private static final String DBName="delivery";

    public static final int DBVersion=1;
    public DB(@Nullable Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table login ( ID Integer primary key AUTOINCREMENT, username text, password text )" );
        db.execSQL("Create Table orders ( ID Integer primary key AUTOINCREMENT, Name text, Address text , Phone text , cardNumber text )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // CRUD operations

    public Boolean insertOrder(String name,String address, String phone, String card){
        SQLiteDatabase sql=this.getWritableDatabase();
        ContentValues contentvalues=new ContentValues();
        contentvalues.put("Name",name);
        contentvalues.put("Address",address);
        contentvalues.put("Phone",phone);
        contentvalues.put("cardNumber",card);
        long res=sql.insert("orders",null,contentvalues);
        //sql.close();
        if(res==-1)
            return false;
        else
            return true;

    }

    public Boolean insert(String useR,String passw){
        SQLiteDatabase sql=this.getWritableDatabase();
        ContentValues contentvalues=new ContentValues();
        contentvalues.put("username",useR);
        contentvalues.put("password",passw);
        long res=sql.insert("login",null,contentvalues);
        //sql.close();
        if(res==-1)
            return false;
        else
            return true;

    }

    public Boolean CheckUserPass(String username,String password){
        SQLiteDatabase sql=this.getReadableDatabase();
        Cursor cursor=sql.rawQuery("Select * from login where username=? and password=? ", new String[] {"username,password"});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
