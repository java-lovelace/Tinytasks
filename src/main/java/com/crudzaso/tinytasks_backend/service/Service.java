package com.crudzaso.tinytasks_backend.service;

import com.crudzaso.tinytasks_backend.model.Task;

import java.util.List;

public interface Service {
    List<Task> getAll();
    Task create(String title);
    Task toggle(Long id);
    void delete(Long id);
}
