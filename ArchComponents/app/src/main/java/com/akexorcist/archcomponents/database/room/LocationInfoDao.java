package com.akexorcist.archcomponents.database.room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings({"UnusedReturnValue", "unused"})

@Dao
public interface LocationInfoDao {

    @Query("SELECT * FROM location_history WHERE user = :user")
    LiveData<List<LocationInfo>> getLocationByUser(String user);

    @Insert
    void insertLocationInfo(LocationInfo locationInfo);

    @Delete
    void deleteAll(LocationInfo... locationInfoList);

    @Update
    void updateAll(List<LocationInfo> locationInfoList);

}




