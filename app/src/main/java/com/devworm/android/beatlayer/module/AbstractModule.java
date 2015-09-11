package com.devworm.android.beatlayer.module;

import com.devworm.android.beatlayer.log.Tracker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Abstract implementation of Module. <br />
 * @since 1.0
 * @created 2015-09-11
 */
public abstract class AbstractModule implements Module{
    private static final InvocationHandler invokeHandler = new InvocationHandler() {
        @Override
        public Object invoke(Object executor, Method method, Object[] args) throws Throwable {
            ThreadLocal<Tracker> localThread = new ThreadLocal<Tracker>();
            Tracker taskTracker = localThread.get();

            // Do something with taskTracker. <br />

            Object result = method.invoke(executor, args);

            return result;
        }
    };

    protected static Module instance;

    protected Module getInstance(){
        if(instance == null){
            instance = new
        }
        return instance;
    }

    public AbstractModule AbstractModule(){

    }

    public final <T extends Module> T newProxyInstance(Class<?>[] motherInterfaces){
        return this.getClass().cast(Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), motherInterfaces, this.invokeHandler);
    }

    public AbstractModule doSomething(){
        return new AbstractModule(){

        };

    }

    protected Tracker getCurrentTaskTracker(){
        return null;
    }
}
