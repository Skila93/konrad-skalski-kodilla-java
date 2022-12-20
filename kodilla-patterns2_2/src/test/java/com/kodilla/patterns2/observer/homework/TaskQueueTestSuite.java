package com.kodilla.patterns2.observer.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TaskQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        TaskQueue moduleA = new ModuleA();
        TaskQueue moduleB = new ModuleB();
        Mentor marek = new Mentor("Marek");
        Mentor jarek = new Mentor("Jarek");
        moduleA.registerObserver(marek);
        moduleB.registerObserver(jarek);

        //When
        moduleA.addTasks("Object-oriented programming");
        moduleA.addTasks("Map interface");
        moduleA.addTasks("LIFO queue");
        moduleB.addTasks("Set interface");

        //Then
        assertEquals(3, marek.getUpdateCount());
        assertEquals(1, jarek.getUpdateCount());
    }
}
