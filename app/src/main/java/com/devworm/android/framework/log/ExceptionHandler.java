package com.devworm.android.framework.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for Exception handler of Callback. <br />
 * @since 1.0
 * @created 2015-09-14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ExceptionHandler {
    Class<? extends Throwable>[] value() default {Throwable.class};
}
