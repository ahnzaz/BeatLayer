package com.devworm.android.beatlayer.log;

import java.lang.reflect.Method;

/**
 * Created by SDS on 2015-09-10.
 */
public class Tracker {
    public <E, A> Object execute(Class<E> executor, Method method, A... args){
        // Prepare operation record.

        // Execute method

        // Handle Exception

        // Record result
    }

    public <E, A> Object execute(Class<E> executor, String method, A... args){
        // Prepare operation record.

        // Execute method

        // Handle Exception

        // Record result
    }

    public <E, A> execute(E Executor, Method method, A... args){

    }

    public <E, A> execute(E Executor, String method, A... args){

    }
}
