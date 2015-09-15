package com.devworm.android.framework.task;

/**
 * Created by SDS on 2015-09-15.
 */
public interface UITaskCallback<A> {
    void updateUI(A... args);
}
