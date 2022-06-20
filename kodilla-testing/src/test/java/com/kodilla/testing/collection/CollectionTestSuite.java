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
        List<Integer> expectedResults = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        expectedResults.add(0);
        expectedResults.add(2);
        expectedResults.add(4);
        expectedResults.add(6);
        expectedResults.add(8);
        expectedResults.add(10);
        for (int i = 0; i < 11; i++) {
            checkList.add(i);
        }
        int n = 0;
        for(Integer expectedResult : expectedResults){
            int resultExterminator = exterminator.exterminate(checkList).get(n);
            Assertions.assertEquals(resultExterminator, expectedResult);
            n++;
        }

    }
}
