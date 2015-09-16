package com.devworm.android.framework.task;

import com.devworm.android.framework.log.Tracker;

/**
 * Created by SDS on 2015-09-15.
 */
public abstract class AbstractTask<E, A, R> implements Task<E, A, R> {

    protected final String taskName;
    protected final Tracker taskTracker;

    protected Abstract(String taskName){
        this.taskName = taskName;
        this.taskTraker = Tracker.newInstance(taskName);
    }

    @Override
    public R executeSync(Class<E> executor, A... args) throws Throwable {
        return null;
    }

    @Override
    public void executeAsync(Class<E> executor, TaskCallback<R> callback, A... args) {

    }

    @Override
    public void executeAsync(Class<E> executor, Object callback, A... args) {

    }

    protected AbstractTask(String taskName, Tracker taskTracker){
        this.taskName = taskName;
        this.taskTracker = taskTracker;
    }

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;
    public static final int PENDING = 1<<1;
    public static final int UNKNOWN = 1<<2;

    @Override
    public R executeSync(E executor, A... args) throws Throwable {
        R taskResult = null;
        // Logging executor and arguments...

        // Run a task
        Throwable caughtException = null;
        try{
            taskResult = this.onTask(e, args);
        } catch(Throwable t){
            caughtException = t;
            // Logging exception.
        } finally{
            if(caughtException != null){
                throw caughtException;
            }
        }

        return taskResult;
    }

    @Override
    public void executeAsync(E executor, TaskCallback<R> callback, A... args) {

    }

    @Override
    public void executeAsync(E executor, Object callback, A... args) {

    }

    @Override
    public void onResult(R result) {

    }

    @Override
    public void onException(Throwable t) {

    }

    protected abstract R onTask(E executor, A... args);
}
