package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BimacTestSuite {
    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().bun("with sesame").sauce("spicy").burgers(2).ingredients("onion").ingredients("mayonnaise").ingredients("jalapeno").ingredients("cheese").build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(4, howManyIngredients);
    }
}
