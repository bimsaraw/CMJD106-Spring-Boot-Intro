package com.ijse.springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.Task;

@Service
public interface TaskService {
    //what do we expect to do with Tasks
    List<Task> getTasksList(); //reading
    Task createTask(Task task); //creating
}
