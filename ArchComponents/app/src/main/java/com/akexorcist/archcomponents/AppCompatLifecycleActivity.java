package com.akexorcist.archcomponents;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

public class AppCompatLifecycleActivity
        extends AppCompatActivity
        implements LifecycleRegistryOwner {
    LifecycleRegistry registry = new LifecycleRegistry(this);

    @Override
    public LifecycleRegistry getLifecycle() {
        return registry;
    }
}
