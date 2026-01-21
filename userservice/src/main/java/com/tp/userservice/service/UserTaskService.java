package com.tp.userservice.service;

import com.tp.userservice.entity.UserTask;
import com.tp.userservice.repository.UserTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTaskService {

    private final UserTaskRepository repository;

    public UserTaskService(UserTaskRepository repository) {
        this.repository = repository;
    }

    public List<UserTask> getAllTasks() {
        return repository.findAll();
    }

    public UserTask addTask(UserTask task) {
        return repository.save(task);
    }

    public UserTask toggleTask(Long id) {
        UserTask task = repository.findById(id).orElseThrow();
        task.setDone(!task.isDone());
        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
