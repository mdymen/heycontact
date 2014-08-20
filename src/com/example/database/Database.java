package com.example.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

	private static int DATABASE_VERSION = 1;
	private static String DATABASE_NAME = "HeyContact.db";
	
	private static String TABLE_NAME_CONTACTS = "contacts";
	private static String TABLE_NAME_CATEGORIES = "categories";
	
	private static String CREATE_TABLE_CONTACTS = "Create table " + TABLE_NAME_CONTACTS + " ( " +
			"id integer primary key autoincrement," +
			"name varchar(50) not null," +
			"telephone varchar(50)," +
			"company varchar(50)," +
			"position varchar(50)," +
			"mail varchar(50)," +
			"aditionalInformation text" +
			") ";
	
	private static String CREATE_TABLE_CATEGORIES = "create table " + TABLE_NAME_CATEGORIES + " ( " +
			"id integer primary key autoincrement," +
			"name varchar(50) not null" +
			")";


	
	public Database(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(CREATE_TABLE_CONTACTS);
		database.execSQL(CREATE_TABLE_CATEGORIES);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
