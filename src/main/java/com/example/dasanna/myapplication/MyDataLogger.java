package com.example.dasanna.myapplication;

import android.content.Context;
import android.content.ContextWrapper;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.SmsManager;
import android.util.Log;

/**
 * Created by dasanna on 4/9/15.
 */
public class MyDataLogger {
    private Context context;
    private SmsManager smsManager;
    private LocationManager locationManager;
    static final String myPhoneNumber = "210-213-9009";

    public MyDataLogger (Context context) {
        context = context;
        smsManager = SmsManager.getDefault();

        sendText("Hello!  Your data logging service has been activated.");
    }

    public void sendText(String message) {
        smsManager.sendTextMessage("210-213-9009", null, message, null, null);
    }

    public void sendUpdate(Location loc) {
        String msg = "Phone at ";
        msg += "latitude " + loc.getLatitude();
        msg += " and longitude " + loc.getLongitude();
        msg += ", with altitude " + loc.getAltitude();

        sendText(msg);
    }

}
