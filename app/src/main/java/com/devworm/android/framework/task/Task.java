package com.devworm.android.framework.task;

/**
 * Interface of all delegable running task. <br />
 *
 * @created 2015-09-14
 * @since 1.0
 */
public interface Task<E, A, R> {
    R executeSync(final Class<E> executor, final A... args) throws Throwable;
    R executeSync(final E executor, final A... args) throws Throwable;

    void executeAsync(final E executor, TaskCallback<R> callback, final A... args);
    void executeAsync(final E executor, Object callback, final A... args);
    void executeAsync(final Class<E> executor, TaskCallback<R> callback, final A... args);
    void executeAsync(final Class<E> executor, Object callback, final A... args);
}