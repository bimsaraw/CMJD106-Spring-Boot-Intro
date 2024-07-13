package com.ijse.springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.Task;

@Service
public interface TaskService {
    //what do we expect to do with Tasks
    List<Task> getTasksList(); //reading
    Task createTask(Task task); //creating
    Task getTaskById(Long id); //finding a task by it's primary key
    Task updateTask(Long id, Task task); //find task and update
    void deleteTask(Long id); //delete task
}
