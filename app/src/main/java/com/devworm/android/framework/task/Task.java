package com.devworm.android.framework.task;

/**
 * Interface of all delegable running task. <br />
 * @since 1.0
 * @created 2015-09-14
 */
public interface Task<E, A, R> {
    R executeSync(final E executor, final A... args) throws Throwable;
    void executeAsync(final E executor, final A... args);

    void onResult(R result);

    void onException(Throwable t);
}
