package com.akexorcist.archcomponents;

import android.os.Bundle;

public class MainActivity extends AppCompatLifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionUtil.requestLocationPermission(enrolled -> {
            if (enrolled) {
                callLocationListener();
            }
        });
    }

    private void callLocationListener() {
        new AwesomeLocationListener(this).observe(this, location -> {
            // Update UI
        });
    }
}

