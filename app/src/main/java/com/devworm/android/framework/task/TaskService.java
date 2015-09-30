package com.devworm.android.framework.task;

/**
 * Interface of task executor. <br />
 *
 * @created 2015-09-14
 * @since 1.0
 */
public class TaskService {
    private final static TaskService instance;

    static {
        instance = new TaskService();
    }

    private TaskService() {

    }

    /**
     * Run task synchronously. <br />
     * @param task
     */
    public void runTask(Task task){
        return this;
    }

    public TaskService addTask(Task task){
        return this;
    }
}