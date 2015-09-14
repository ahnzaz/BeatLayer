package com.devworm.android.framework.log;

import java.util.Map;

/**
 * Created by SDS on 2015-09-10.
 */
public class TextRecord extends AbstractRecord{
    private final StringBuilder builder;

    {
        this.builder = new StringBuilder();
    }

    TextRecord add(String tag, String value){

        return this;
    }

    TextRecord add(Map<String, String> tagMap){
        return this;
    }
}
