package com.devworm.android.beatlayer.network;

import java.io.InputStream;

/**
 * Created by SDS on 2015-09-03.
 */
public interface NetworkRequestHandler {

    public void onConnected(InputStream stream);

    public void onConnectFailed();

}