package org.example.todolist.service;

import org.example.todolist.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private final List<Todo> todoList;

    public TodoService() {
        this.todoList = new ArrayList<>();
    }

    public List<Todo> getAllTodos() {
        return todoList;
    }

    public Todo getTodoById(Long id) {
        return todoList.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    public void updateTodo(Todo updatedTodo) {
        Todo todoToUpdate = getTodoById(updatedTodo.getId());
        if (todoToUpdate != null) {
            todoToUpdate.setTask(updatedTodo.getTask());
            todoToUpdate.setDescription(updatedTodo.getDescription());
            todoToUpdate.setDone(updatedTodo.isDone());
        }
    }

    public void deleteTodoById(Long id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
    }
}
