package com.akexorcist.archcomponents;

import android.os.Bundle;

public class MainActivity extends AppCompatLifecycleActivity {
    private AwesomeLocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationListener = new AwesomeLocationListener(this,
                getLifecycle(),
                location -> {
                    // Update UI
                });
        PermissionUtil.requestLocationPermission(enrolled -> {
            if (enrolled) {
                locationListener.enable();
            }
        });
    }
}



