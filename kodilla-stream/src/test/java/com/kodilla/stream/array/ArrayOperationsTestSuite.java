package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{5, 4, 1, 2, 6, 4, 4, 3, 2, 5, 2, 6, 4, 4, 3, 1, 2, 1, 3, 5};
        //When
        double meanValue = ArrayOperations.getAverage(numbers);
        double expectedMean = 3.35;
        //Then
        assertEquals(expectedMean, meanValue);
    }
}
