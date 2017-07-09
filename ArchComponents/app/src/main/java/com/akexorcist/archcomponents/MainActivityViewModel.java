package com.akexorcist.archcomponents;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.location.Location;

import com.akexorcist.archcomponents.database.oldschool.LocationDbKey;
import com.akexorcist.archcomponents.database.room.LocationInfo;
import com.akexorcist.archcomponents.database.room.LocationInfoDatabase;

import java.util.List;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings({"WeakerAccess", "unused"})

public class MainActivityViewModel extends ViewModel {

    private LiveData<Location> location;
    private LiveData<List<LocationInfo>> locationInfoList;

    public LiveData<List<LocationInfo>> getLocationByUser(Context context, String user) {
        if (locationInfoList == null) {
            LocationInfoDatabase db = Room.databaseBuilder(context,
                    LocationInfoDatabase.class, LocationDbKey.DATABASE_NAME).build();
            locationInfoList = db.locationInfoDao().getLocationByUser(user);
        }
        return locationInfoList;
    }

    public LiveData<Location> getLocation(Context context) {
        if (location == null) {
            location = new AwesomeLocationListener(context);
        }
        return location;
    }
}
