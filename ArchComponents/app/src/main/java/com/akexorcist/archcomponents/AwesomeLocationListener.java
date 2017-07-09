package com.akexorcist.archcomponents;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

@SuppressWarnings({"WeakerAccess", "StatementWithEmptyBody", "FieldCanBeLocal", "unused"})

public class AwesomeLocationListener implements LifecycleObserver {
    private boolean enabled = false;
    private Listener listener;
    private Lifecycle lifecycle;

    public AwesomeLocationListener(Context context, Lifecycle lifecycle, Listener listener) {
        Resources resources = context.getResources();
        this.listener = listener;
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
    }

    public void enable() {
        enabled = true;
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            // Connect location service if not connected
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
        if(enabled) {
            // Start location tracking
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        // Stop and disconnect
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void cleanup() {
        lifecycle.removeObserver(this);
    }

    public interface Listener {
        void onLocationChanged(Location location);
    }

}
