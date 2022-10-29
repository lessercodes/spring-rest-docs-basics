package com.lessercodes.springrestdocsbasics.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lessercodes.springrestdocsbasics.todo.model.Todo;

import lombok.RequiredArgsConstructor;
import lombok.val;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable Long id) {
        val title = String.format("Title #%s", id);
        val todo = new Todo(id, title);
        return ResponseEntity.ok(todo);
    }

}
