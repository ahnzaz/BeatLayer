package com.devworm.android.beatlayer.log;

import java.lang.reflect.Method;

/**
 * Unit operation class. <br />
 *
 * @created 2015-09-11
 * @modified 2015-09-11
 * @since 1.0
 */
public abstract class Operation<E, A, R> {

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;
    public static final int PENDING = 1 << 1;
    public static final int UNKNOWN = 1 << 2;
    private final Tracker tracker;

    public Operation(Tracker tracker) {
        this.tracker = tracker;
    }

    /**
     * @param e
     * @param method
     * @param params
     * @return
     * @since 1.0
     */
    public int execute(E e, Method method, A... params) {

        // NULL check
        if (e == null) {
            // Executor object is null;
            return this.onException(new IllegalArgumentException("Given executor object is null."));
        } else if (method == null) {
            // Method object is null;
            return this.onException(new IllegalArgumentException("Given method object is null."));
        }

        // Arguments check.
        if (params != null && params.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                try {
                    if (params[i] != null && !parameterTypes[i].isInstance(params[i])) {
                        // Argument type does not matched.
                        return this.onException(new IllegalArgumentException("Argument at " + i + " poision is not instance of " + parameterTypes[i].getName()));
                    }
                } catch (ArrayIndexOutOfBoundsException aibe) {
                    return this.onException(new IllegalArgumentException("Given arguments count does not matched."));
                }
            }
        }

        // Execution
        Object rawResult = null;
        try {
            rawResult = method.invoke(e, params);
        } catch (Throwable t) {
            // Exception occurred while process method. logging
            return this.onException(t);
        } finally {
            if (rawResult != null) {
                R refinedResult = null;
                try {
                    refinedResult = (R) rawResult;
                } catch (ClassCastException cce) {
                    // Result is not instance of expected type 'R' logging.
                    this.onException(cce);
                } finally {
                    try {
                        return this.onResult((R) rawResult);
                    } catch (Throwable tFromCallback) {
                        // Exception occurred when handle result by callback method. logging.
                        this.handleException(this.tracker, tFromCallback);
                        return FAILURE;
                    }
                }
            }
        }

        return UNKNOWN;
    }

    private final int onResult(R rawResult) {
        this.handleResult(this.tracker, rawResult);
        return SUCCESS;
    }

    public void execute(E e, String method, A... args) {

    }

    public void execute(Class<? extends E> e, Method method, A... args) {

    }

    public void execute(Class<? extends E> e, String method, A... args) {

    }

    private final int onException(Throwable t) {
        return UNKNOWN;
    }

    protected void handleResult(Tracker tracker, R result) {

    }

    protected void handleException(Tracker tracker, Throwable t) {

    }

    protected void handleResultOnUI(Tracker tracker, R result) {

    }

    protected void handleExceptionOnUI(Tracker tracker, R result) {

    }
}
