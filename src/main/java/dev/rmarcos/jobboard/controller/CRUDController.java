package dev.rmarcos.jobboard.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @param <T> data type
 * @param <ID> id object type
 */
@RequestMapping(produces = "application/json")
public abstract class CRUDController<T, ID> {
    @GetMapping
    ResponseEntity<List<T>> getAll(){
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    ResponseEntity<T> get(@Valid @PathVariable ID id){
        return ResponseEntity.ok(null);
    }

    @PostMapping
    ResponseEntity<Void> post(@Valid @RequestBody T data){
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    ResponseEntity<Void> put(@Valid @RequestBody T data, @Valid @PathVariable ID id){
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    ResponseEntity<Void> patch(@Valid @RequestBody T data, @Valid @PathVariable ID id){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@Valid @PathVariable ID id){
        return ResponseEntity.ok().build();
    }
}
