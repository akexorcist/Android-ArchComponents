package com.akexorcist.archcomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private AwesomeLocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationListener = new AwesomeLocationListener(this, location -> {
            // Update UI
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        PermissionUtil.requestLocationPermission(enrolled -> {
            if(enrolled) {
                locationListener.start();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        locationListener.stop();
    }
}



