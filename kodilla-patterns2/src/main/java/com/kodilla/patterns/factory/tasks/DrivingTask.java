package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    String isTaskDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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