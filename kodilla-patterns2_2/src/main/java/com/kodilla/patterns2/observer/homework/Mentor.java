package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }
    @Override
    public void update(TaskQueue taskQueue){
        System.out.println(name + " added new task to check in module: " + taskQueue.getName() +
                " total tasks to check: " + taskQueue.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}