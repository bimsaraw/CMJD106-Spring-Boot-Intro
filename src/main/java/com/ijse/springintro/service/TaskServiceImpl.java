package com.ijse.springintro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.Task;
import com.ijse.springintro.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
    
    @Autowired //automatically injecting the dependencies
    private TaskRepository taskRepository;

    @Override
    public List<Task> getTasksList() {
        return taskRepository.findAll();
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

}
