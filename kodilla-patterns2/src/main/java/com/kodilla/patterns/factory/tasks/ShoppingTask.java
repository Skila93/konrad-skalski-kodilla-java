package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quality;
    String isTaskDone;

    public ShoppingTask(String taskName, String whatToBuy, double quality) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quality = quality;
        this.isTaskDone = "Task not done";
    }

    @Override
    public String executeTask(){
        isTaskDone = "Task not done, processing... Task done!";
        return isTaskDone;
    }
    @Override
    public String getTaskName(){
        return taskName;
    }
    @Override
    public boolean isTaskExecuted(){
        if(executeTask() == "Task not done, processing... Task done!"){
            return true;
        } else return false;
    }
}