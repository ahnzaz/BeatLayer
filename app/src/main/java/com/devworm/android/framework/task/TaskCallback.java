package com.devworm.android.framework.task;

/**
 * Main task callback function. <br />
 * @since 1.0
 * @create 2015-09-14
 */
public interface TaskCallback<R> {
    void handleResult(R result);
    void handleException(Throwable t);
    void handleResultOnUI(R result);
    void handleExceptionOnUI(Throwable t);
}
