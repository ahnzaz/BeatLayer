package com.devworm.android.framework.task.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Exception handler method definition. <br />
 * @since 1.0
 * @created 2015-09-15
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnException {
    Class<? extends Throwable>[] value() default {Throwable.class};
}
