package com.example.dasanna.myapplication;

import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import com.example.dasanna.myapplication.MyDataLogger;

/**
 * Created by dasanna on 4/17/15.
 */
public class MyLocationListener implements LocationListener {
    private MyDataLogger logger;
    private LocationManager manager;

    public MyLocationListener (MyDataLogger myDataLogger, LocationManager myLocationManager) {
        logger = myDataLogger;
        manager = myLocationManager;

    }

    public void onLocationChanged(Location location) {
        Log.d("YOLO", "SWAG LOCATION CHANGED");
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    public void onProviderEnabled(String provider) {
        Log.d("YOLO", "The GPS provider is enabled.");
    }

    public void onProviderDisabled(String provider) {
        Log.d("YOLO", "The GPS provider is disabled.");
    }
}
