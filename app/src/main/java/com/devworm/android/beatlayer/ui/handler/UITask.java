package com.devworm.android.beatlayer.ui.handler;

import android.os.AsyncTask;

/**
 * Task invoker from UI command. <br />
 * @author devworm
 * @since 1.0
 * @created 2015-09-09
 * @modified 2015-09-09
 */
public abstract class UITask<Param, Progress, Result> {

    private AsyncTask<Param, Progress, Result> asyncTask = null;

    public UITask(String taskName, int priorityLevel, Param... param){

    }

    public UITask<Param, Progress, Result> execute(Param... params){
        UITask<Param, Progress, Result> instance = this;

        return this;
    }

    protected abstract Param[] beforeExecute(Param... args);

    protected abstract Result doInBackground(Param... args);

    protected final void publishProgress(Progress progress){

    }

    protected abstract void onProgress(Progress progress);

    protected abstract void afterExecute(Result result);

    protected abstract void onExceptionOccured(Throwable t);
}
