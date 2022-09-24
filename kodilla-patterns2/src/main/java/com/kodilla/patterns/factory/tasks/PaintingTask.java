package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    String isTaskDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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