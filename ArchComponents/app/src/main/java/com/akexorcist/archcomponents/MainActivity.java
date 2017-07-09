package com.akexorcist.archcomponents;

import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.os.Bundle;

import com.akexorcist.archcomponents.database.oldschool.LocationDbKey;
import com.akexorcist.archcomponents.database.room.LocationInfoDatabase;

@SuppressWarnings("unused")
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

    private void getLocationByUser(String user) {
        LocationInfoDatabase db = Room.databaseBuilder(getApplicationContext(),
                LocationInfoDatabase.class, LocationDbKey.DATABASE_NAME).build();
        db.locationInfoDao().getLocationByUser(user);
    }
}
