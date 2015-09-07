package com.devworm.android.beatlayer.storage;

/**
 * Created by SDS on 2015-09-07.
 */
public interface StorageWriteHandler {
    public void onWrite(String source, boolean succeed, long length);
}
