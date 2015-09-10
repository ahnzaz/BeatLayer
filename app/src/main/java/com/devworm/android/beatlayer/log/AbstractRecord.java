package com.devworm.android.beatlayer.log;

/**
 * Created by SDS on 2015-09-10.
 */
public abstract class AbstractRecord implements Record{
    protected final String name;
    protected final int sequence;

    AbstractRecord(int sequence, String name){
        this.name = name;
        this.sequence = sequence;
    }
}
