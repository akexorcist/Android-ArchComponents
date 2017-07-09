package com.akexorcist.archcomponents;

/**
 * Created by Akexorcist on 7/9/2017 AD.
 */

public class PermissionUtil {
    public static void requestLocationPermission(LocationCallback callback) {

    }

    public interface LocationCallback {
        void onLocationPermissionCallback(boolean enrolled);
    }
}
