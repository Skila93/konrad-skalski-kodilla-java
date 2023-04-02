package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable {
    private final Deque<String> tasks;
    private final List<Observer> observers;
    private final String name;

    public TaskQueue(String name) {
        this.name = name;
        observers = new ArrayList<>();
        tasks = new ArrayDeque<String>();
    }

    public String getName() {
        return name;
    }
    public void addTasks(String task) {
        tasks.offerFirst(task);
        notifyObservers();
    }
    @Override
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
        }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver (Observer observer){
        observers.remove(observer);
    }

    public Deque<String> getTasks() {
        return tasks;
    }
}