package com.Tharushi.ProTask.service;

import com.Tharushi.ProTask.model.Task;

public interface TaskService {
    public Task saveTask(Task task);
    // it takes a Task object as a parameter, and it returns a Task object. 
    // The public keyword indicates that this method is part of the interface and is accessible from outside the package.
}
