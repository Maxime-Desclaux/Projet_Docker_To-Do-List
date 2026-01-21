package com.tp.userservice.repository;

import com.tp.userservice.entity.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTaskRepository extends JpaRepository<UserTask, Long> {}
