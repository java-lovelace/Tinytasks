package com.crudzaso.tinytasks_backend.controller;

import com.crudzaso.tinytasks_backend.model.Task;
import com.crudzaso.tinytasks_backend.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Map<String, String> body) {
        String title = body.get("title");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(title));
    }

    @PutMapping("/{id}/toggle")
    public ResponseEntity<Task> toggle(@PathVariable Long id) {
        return ResponseEntity.ok(service.toggle(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
