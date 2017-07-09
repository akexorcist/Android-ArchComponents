package com.akexorcist.archcomponents.database.oldschool;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

public class LocationDatabase {

    public static List<Location> getLocationByUser(Context context, String user) {

        LocationDbHelper dbHelper = new LocationDbHelper(context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                LocationDbKey.COLUMN_ID,
                LocationDbKey.COLUMN_USER,
                LocationDbKey.COLUMN_LATITUDE,
                LocationDbKey.COLUMN_LONGITUDE
        };

        String selection = LocationDbKey.COLUMN_USER + " = ?";
        String[] selectionArgs = {user};

        String sortOrder = LocationDbKey.COLUMN_LATITUDE + " DESC";

        Cursor cursor = db.query(
                LocationDbKey.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                sortOrder
        );
        cursor.close();
        return new ArrayList<>();

    }
}
