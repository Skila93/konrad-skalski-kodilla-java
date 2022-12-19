package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15),calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String desc = pizzaOrder.getDescription();
        // Then
        assertEquals("You ordered pizza with tomato sauce and cheese", desc);
    }
    @Test
    public void testPizzaWithHamOrderGetCost(){
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(17),calculatedCost);
    }
    @Test
    public void testPizzaWithHamOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        // When
        String desc = pizzaOrder.getDescription();
        // Then
        assertEquals("You ordered pizza with tomato sauce and cheese and ham", desc);
    }
    @Test
    public void testPizzaWithHamAndAdditionalCheeseOrderGetCost(){
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(18.5),calculatedCost);
    }
    @Test
    public void testPizzaWithHamAndAdditionalCheeseOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        // When
        String desc = pizzaOrder.getDescription();
        // Then
        assertEquals("You ordered pizza with tomato sauce and cheese and ham and additional cheese", desc);
    }
    @Test
    public void testPizzaWithHamAndAdditionalCheeseAndMushroomsOrderGetCost(){
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(19.5),calculatedCost);
    }
    @Test
    public void testPizzaWithHamAndAdditionalCheeseAndMushroomsOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        String desc = pizzaOrder.getDescription();
        // Then
        assertEquals("You ordered pizza with tomato sauce and cheese and ham and additional cheese and mushrooms", desc);
    }
    @Test
    public void testBasicPizzaWithMushroomsOrderGetCost(){
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(16),calculatedCost);
    }
    @Test
    public void testBasicPizzaWithMushroomsOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        String desc = pizzaOrder.getDescription();
        // Then
        assertEquals("You ordered pizza with tomato sauce and cheese and mushrooms", desc);
    }
}
