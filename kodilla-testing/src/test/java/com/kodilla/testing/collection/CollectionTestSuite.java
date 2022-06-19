package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeEach
    public void bef() {
        System.out.println("Test Case: Begin");
    }

    @AfterEach
    public void aft() {
        System.out.println("Test Case: End");
    }

    @DisplayName("when list checkList is empty, " +
            "then result should return true"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> checkList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        boolean expectedResult = true;
        boolean result = exterminator.exterminate(checkList).isEmpty();
        //Then
        Assertions.assertEquals(expectedResult,result);
    }

    @DisplayName("when all numbers stored in List are even, " +
            "then result should be zero"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> checkList = new ArrayList<>();
        Random numbersGenerator = new Random();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        int expectedResult = 0;
        for (int i = 0; i < 10; i++) {
            checkList.add(numbersGenerator.nextInt(50));
        }
        for (int n = 0; n < exterminator.exterminate(checkList).size(); n++) {
            int result = exterminator.exterminate(checkList).get(n) % 2;
            //Then
            Assertions.assertEquals(result, expectedResult);
        }
    }
}
