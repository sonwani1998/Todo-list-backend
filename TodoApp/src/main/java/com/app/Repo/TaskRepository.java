package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
