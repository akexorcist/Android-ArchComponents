package com.akexorcist.archcomponents;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.location.Location;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings("WeakerAccess")


public class MainActivityViewModel extends ViewModel {
    private LiveData<Location> userData;

    public LiveData<Location> getLocation(Context context) {
        if (userData == null) {
            userData = new AwesomeLocationListener(context);
        }
        return userData;
    }
}
