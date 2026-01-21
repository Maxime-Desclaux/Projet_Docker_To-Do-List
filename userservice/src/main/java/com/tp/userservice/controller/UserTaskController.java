package com.tp.userservice.controller;

import com.tp.userservice.entity.UserTask;
import com.tp.userservice.repository.UserTaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-tasks")
public class UserTaskController {

    private final UserTaskRepository repository;

    public UserTaskController(UserTaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UserTask> all() {
        return repository.findAll();
    }

    @PostMapping
    public UserTask add(@RequestBody UserTask userTask) {
        return repository.save(userTask);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
