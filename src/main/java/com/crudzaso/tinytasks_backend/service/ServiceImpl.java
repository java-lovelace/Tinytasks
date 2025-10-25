package com.crudzaso.tinytasks_backend.service;

import com.crudzaso.tinytasks_backend.exception.BadRequestException;
import com.crudzaso.tinytasks_backend.exception.NotFoundException;
import com.crudzaso.tinytasks_backend.model.Task;
import com.crudzaso.tinytasks_backend.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements com.crudzaso.tinytasks_backend.service.Service {

    private final Repository repository;

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> getAll() {
        return repository.findAll();
    }

    @Override
    public Task create(String title) {
        if (title == null || title.trim().length() < 3) {
            throw new BadRequestException("Title is required");
        }
        Task task = new Task(null, title.trim(), false);
        return repository.save(task);
    }

    @Override
    public Task toggle(Long id) {
        Task t = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Not found"));
        t.setDone(!t.isDone());
        return repository.save(t);
    }

    @Override
    public void delete(Long id) {
        boolean removed = repository.deleteById(id);
        if (!removed) {
            throw new NotFoundException("Not found");
        }
    }
}
