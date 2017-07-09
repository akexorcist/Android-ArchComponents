package com.akexorcist.archcomponents;

import android.arch.lifecycle.ViewModelProviders;
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
        ViewModelProviders.of(this)
                .get(MainActivityViewModel.class)
                .getLocation(this)
                .observe(this, location -> {
                    // Update UI
                });
    }
}
