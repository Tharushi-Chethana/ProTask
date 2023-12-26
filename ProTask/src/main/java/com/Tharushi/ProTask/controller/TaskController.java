package com.Tharushi.ProTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Tharushi.ProTask.model.Task;
import com.Tharushi.ProTask.service.TaskService;

@RestController //will get the response body and controller at the same time
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    //save data into the database
    @PostMapping("/add")
    public String add(@RequestBody Task task){
        taskService.saveTask(task);
        return "New task is added";
    }
}
