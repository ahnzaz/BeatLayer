package com.devworm.android.framework.log;

import java.util.Map;

/**
 * Created by SDS on 2015-09-09.
 */
public class Log {

    public static final int VERBOS  = 1;
    public static final int DEBUG   = 1<<1;
    public static final int INFO    = 1<<2;
    public static final int WARN    = 1<<3;
    public static final int ERROR   = 1<<4;
    public static final int ASSERT  = 1<<5;
    public static final int FATAL   = 1<<6;

    private static long staticSequence = 1;
    private final Map<String, String> tag;
    private final String task;
    private final Class<?> creator;
    private final int ownSequence;
    private int operationSeq;

    private final StringBuilder builder;

    {
        this.builder = new StringBuilder();
        this.ownSequence = staticSequence++;
    }

    public static final Log newInstance(){
        return new Log();
    }
    
    private Log(String task, Class<?> creator, Map<String, String> tagMap){
        this.task = task;
        this.creator = creator;
        this.tag = tagMap;
    }

    Log add(String tag, String value){
        return this;
    }

    public Log addComma(String value) {
        if (this.builder.length() > 0) {
            this.builder.append(',');
        }
        this.builder.append(value);
        return this;
    }

    public Log addParenthesis(String value){
        this.builder.append('(').append(value).append(')');
        return this;
    }

    public Log addBracket(String value){
        return this;
    }

    public Log addSquareBracker(String value){
        return this;
    }
}
