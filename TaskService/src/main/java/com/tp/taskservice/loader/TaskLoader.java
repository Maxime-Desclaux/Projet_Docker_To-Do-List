package com.tp.taskservice.loader;

import com.tp.taskservice.entity.Task;
import com.tp.taskservice.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskLoader implements CommandLineRunner {

    private final TaskRepository repository;

    public TaskLoader(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Task("Faire les courses", "Acheter fruits et légumes"));
        repository.save(new Task("Apprendre Java", "Revoir Spring Boot et Docker"));
    }
}
