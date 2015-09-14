package com.devworm.android.framework.task;

/**
 * Interface of all delegable running task. <br />
 * @since 1.0
 * @created 2015-09-14
 */
public interface Task<A, R> {
    public R executeSync(A... args) throws Throwable;
    public R executeAsync(TaskCallback clb, A... args);
}
