package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.morningShopping);
        //Then
        assertEquals("Morning shopping", task.getTaskName());
        assertEquals("Task not done, processing... Task done!", task.executeTask());
        assertEquals(true, task.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.fencePainting);
        //Then
        assertEquals("Fence painting", task.getTaskName());
        assertEquals("Task not done, processing... Task done!", task.executeTask());
        assertEquals(true, task.isTaskExecuted());
    }
    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.officeCommuting);
        //Then
        assertEquals("Office commuting", task.getTaskName());
        assertEquals("Task not done, processing... Task done!", task.executeTask());
        assertEquals(true, task.isTaskExecuted());
    }
}
