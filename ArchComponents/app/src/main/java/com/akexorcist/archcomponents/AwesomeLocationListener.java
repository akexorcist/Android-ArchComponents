package com.akexorcist.archcomponents;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.util.Log;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings("WeakerAccess")
public class AwesomeLocationListener {
    private Listener listener;

    public AwesomeLocationListener(Context context, Listener listener) {
        Resources resources = context.getResources();
        this.listener = listener;
    }

    public void start() {
        Log.e("Status", "Start");
        if(listener != null) {
            listener.onLocationChanged(new Location("current_location"));
        }
    }

    public void stop() {
        Log.e("Status", "Stop");
    }

    public interface Listener {
        void onLocationChanged(Location location);
    }

}
