package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(1, 7);
        double subResult = calculator.sub(40, 12);
        double mulResult = calculator.mul(8, 7);
        double divResult = calculator.div(10, 2);
        //Then
        Assert.assertEquals(8, addResult, 0.01);
        Assert.assertEquals(28, subResult, 0.01);
        Assert.assertEquals(56, mulResult, 0.01);
        Assert.assertEquals(5, divResult, 0.01);
    }
}