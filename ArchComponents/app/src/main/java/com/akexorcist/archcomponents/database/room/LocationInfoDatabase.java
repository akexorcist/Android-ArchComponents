package com.akexorcist.archcomponents.database.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@Database(entities = {LocationInfo.class}, version = 1)
public abstract class LocationInfoDatabase extends RoomDatabase {
    public abstract LocationInfoDao locationInfoDao();
}

