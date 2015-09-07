package com.devworm.android.beatlayer.storage;

import java.io.OutputStream;

/**
 * Created by SDS on 2015-09-07.
 */
public interface StorageModule {

    public byte[] readData(String source);
    public void readData(String source, StorageReadHandler handler);
    public void openInputStream(String source, StorageReadHandler handler);

    public void writeData(String source, byte[] data, StorageWriteHandler handler);
    public void writeData(String source, OutputStream stream, StorageWriteHandler handler);
}