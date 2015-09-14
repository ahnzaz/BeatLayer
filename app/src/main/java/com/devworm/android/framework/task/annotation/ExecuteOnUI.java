package com.devworm.android.framework.task.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Flag for method must be running on UI thread or not. <br />
 * @since 1.0
 * @created 2015-09-14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecuteOnUI {
    boolean value() default false;
}
