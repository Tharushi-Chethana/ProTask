package com.Tharushi.ProTask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Tharushi.ProTask.model.Task;
import com.Tharushi.ProTask.repository.TaskRepository;

@Service
public class TaskServiceImp implements TaskService {
    // TaskServiceImp: class name
    // TaskService: interface

    @Autowired
    private TaskRepository taskRepository;
    //This annotation is used for automatic dependency injection, 
    //meaning that Spring will automatically inject an instance of TaskRepository into this field when an instance of TaskServiceImp is created.
    
    @Override
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
}