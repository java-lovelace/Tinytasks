package com.crudzaso.tinytasks_backend.repository;

import com.crudzaso.tinytasks_backend.model.Task;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


@org.springframework.stereotype.Repository
public class RepositoryMemory implements com.crudzaso.tinytasks_backend.repository.Repository {

    private final Map<Long, Task> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public RepositoryMemory() {

        save(new Task(null, "Learn Spring Boot", false));
        save(new Task(null, "Wire up the frontend", false));
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(seq.incrementAndGet());
        }
        store.put(task.getId(), task);
        return task;
    }

    @Override
    public boolean deleteById(Long id) {
        return store.remove(id) != null;
    }
}
