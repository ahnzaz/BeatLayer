package com.devworm.android.beatlayer.storage;

import java.io.InputStream;

/**
 * Created by SDS on 2015-09-07.
 */
public interface StorageReadHandler {
    public void onRead(String source, byte[] data);
    public void onRead(String source, InputStream stream);
    public void onRead(String source, int offset, int length, byte[] data);
    public void onExceptionOccurred(String source, Throwable exception);
}
