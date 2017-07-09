package com.akexorcist.archcomponents.database.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings({"unused", "WeakerAccess"})

@Entity
public class LocationInfo {
    @PrimaryKey
    int _id;
    String user;
    double latitude;
    double longitude;
}
