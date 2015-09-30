package com.devworm.android.framework.task;

import com.devworm.android.framework.log.Tracker;

import java.security.Timestamp;

/**
 * Created by SDS on 2015-09-15.
 */
public abstract class AbstractTask<E, A, R> implements Task<E, A, R> {

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;
    public static final int PENDING = 1<<1;
    public static final int UNKNOWN = 1<<2;
    protected final String taskName;
    protected final Tracker taskTracker;
    
    protected static long taskSequence;
    protected Timestamp startTime;
    protected Timestamp endTime;

    protected AbstractTask(String taskName){
        this.taskName = taskName;
        this.taskTracker = Tracker.newInstance(taskName);
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

    @Override
    public R executeSync(E executor, A... args) throws Throwable {
        R taskResult = null;
        // Logging executor and arguments...

        // Run a task
        Throwable caughtException = null;
        try{
            taskResult = this.onProgress(e, args);
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

    private void onResult(R result){
        // Logging result.

        // Handle result.
    }

    private void onException(Exception e){
        // Logging exception

        // Handle exception.
    }

    abstract protected int handleResult(R result);
    abstract protected void handleException(Exception e);
    abstract protected R doTask(E executor, A... args);
}
