package com.devworm.android.beatlayer.ui.handler;

/**
 * Task invoker from UI command. <br />
 * @author devworm
 * @since 1.0
 * @created 2015-09-09
 * @modified 2015-09-09
 */
public interface UITask<PARAM, RETURN> {
    public void invoke();
    public RETURN callback(PARAM... args);
}
