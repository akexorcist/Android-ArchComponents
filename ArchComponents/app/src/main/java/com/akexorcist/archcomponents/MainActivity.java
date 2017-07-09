package com.akexorcist.archcomponents;

import android.os.Bundle;

public class MainActivity extends AppCompatLifeCycleActivity {
    private AwesomeLocationListener locationListener;

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
        AwesomeLocationListener listener = new AwesomeLocationListener(this);
        listener.observe(this, location -> {
            // Update UI
        });
    }
}
