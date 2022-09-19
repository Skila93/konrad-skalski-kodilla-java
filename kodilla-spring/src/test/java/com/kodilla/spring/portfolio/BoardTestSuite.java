package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void taskListTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("task to do");
        board.getInProgressList().addTask("in progress list");
        board.getDoneList().addTask("done list");

        //Then
        Assert.assertEquals("task to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("in progress list", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done list", board.getDoneList().getTasks().get(0));
    }

}
