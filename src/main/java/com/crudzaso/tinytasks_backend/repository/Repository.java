package com.crudzaso.tinytasks_backend.repository;

import com.crudzaso.tinytasks_backend.model.Task;

import java.util.List;
import java.util.Optional;

public interface Repository {
    List<Task> findAll();
    Optional<Task> findById(Long id);
    Task save(Task task);
    boolean deleteById(Long id);
}
