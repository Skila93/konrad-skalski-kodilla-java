package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    void LoggerTest(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("logging...");

        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("logging...", log);
    }
}
