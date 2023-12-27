package com.Tharushi.ProTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tharushi.ProTask.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{
    //Task: model & Integer: primary key
}
