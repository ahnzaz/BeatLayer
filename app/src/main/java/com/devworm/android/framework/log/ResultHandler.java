package com.devworm.android.framework.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by SDS on 2015-09-14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResultHandler {
    /**
     * Whether method could be called only on UI thread or not. <br />
     * If set this flag true, do not call directly. Let framework call this on UI Thread. <br />
     * @return
     */
    boolean onUIThread() default false;
}
