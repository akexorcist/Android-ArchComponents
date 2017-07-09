package com.akexorcist.archcomponents.database.oldschool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

public class LocationDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_FILE_NAME = "location_history.db";

    public LocationDbHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
