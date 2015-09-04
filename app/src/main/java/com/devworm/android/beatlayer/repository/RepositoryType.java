package com.devworm.android.beatlayer.repository;

/**
 * Created by SDS on 2015-09-04.
 */
public enum RepositoryType {
    LOCAL("Local", false),
    DAAP("DAAP", true),
    WEBDAV("WebDav", true);

    private final String name;
    private final boolean isRemote;

    private RepositoryType(String name, boolean isRemote) {
        this.name = name;
        this.isRemote = isRemote;
    }

    public String getName() {
        return name;
    }

    public boolean isRemote() {
        return isRemote;
    }
}
