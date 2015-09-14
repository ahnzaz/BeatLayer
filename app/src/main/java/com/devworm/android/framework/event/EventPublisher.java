package com.devworm.android.framework.event;

/**
 * Event publisher object to invoke event listeners. <br />
 * @since 1.0
 * @created 2015-09-14
 */
public interface EventPublisher {

    void publishEvent(Event event);
}
