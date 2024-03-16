package org.example.todolist.config;

import org.example.todolist.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TodoListDataSourceConfig {

    @Bean
    public List<Todo> todoListDataSource() {
        List<Todo> todoList = new ArrayList<>();

        // Add sample Todo items
        todoList.add(new Todo("Complete Spring MVC tutorial", "Finish the tutorial on building a Spring MVC application"));
        todoList.add(new Todo("Implement CRUD operations", "Implement functionality to add, edit, delete Todo items"));
        todoList.add(new Todo("Test the application", "Ensure all functionalities work as expected"));

        return todoList;
    }
}
