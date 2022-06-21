package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testNumber = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Tests are about to begin.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testNumber++;
        System.out.println("Test number: " + testNumber);

    }
    @Test
    void testAddFigure() {
        //Given
        Shape circle = new Circle("circle", 5);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(circle);

        //Then
        Assertions.assertEquals(1, collector.getFiguresQuantity());
    }
    @Test
    void testRemoveFigure() {
        //Given
        Shape triangle = new Triangle("triangle",3.5, 4);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);

        //When
        boolean result = collector.removeFigure(triangle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, collector.getFiguresQuantity());
    }
    @Test
    void testGetFigure() {
        //Given
        Shape square = new Square("triangle",7, 8);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);

        //When
        Shape retrievedShape;
        retrievedShape = collector.getFigure(0);
        //Then
        Assertions.assertEquals(square, retrievedShape);
    }
}

    @Nested
    @DisplayName("Tests for adding and showing ArrayList"
    )
    class arrayListShowTest{
    @Test
    void testShowFigures(){
        //Given
        Shape square = new Square("triangle",7, 8);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);

        //When
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(square);
        String expectedFigures = shapeList.toString();
        String retrievedFigures = collector.showFigures();

        //Then
        Assertions.assertEquals(expectedFigures, retrievedFigures);
    }
}
