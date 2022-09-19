package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard(){
        return new Board(toDoList(), inProgressList(), doneList());
    }
    public TaskList toDoList(){
        return new TaskList();
    }
    public TaskList inProgressList(){
        return new TaskList();
    }
    public TaskList doneList(){
        return new TaskList();
    }
}
