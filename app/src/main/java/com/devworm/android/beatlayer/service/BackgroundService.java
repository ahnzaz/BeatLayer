package com.devworm.android.beatlayer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.security.Provider;

/**
 * Created by SDS on 2015-09-04.
 */
public class BackgroundService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
