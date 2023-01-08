package com.explanatory.learnspringsecurity.resources;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    public static final List<Todo> TODOS_LIST = List.of(new Todo("explanatory", "Learn AWS"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        return TODOS_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo) {

    }

}

record Todo(String username, String description) {}