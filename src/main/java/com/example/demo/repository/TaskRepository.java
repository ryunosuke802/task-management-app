package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // 何も書かなくても、save・findAll・deleteなどが自動で使える
}
