package com.devworm.android.framework.task;

/**
 * Created by SDS on 2015-09-15.
 */
public abstract class AbstractTask<E, A, R> implements Task<E, A, R> {

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;
    public static final int PENDING = 1<<1;
    public static final int UNKNOWN = 1<<2;

    @Override
    public R executeSync(E executor, A... args) throws Throwable {
        return null;
    }

    @Override
    public void executeAsync(E executor, A... args) {

    }

    @Override
    public void onResult(R result) {

    }

    @Override
    public void onException(Throwable t) {

    }

    protected abstract R onTask(E executor, A... args);
}
