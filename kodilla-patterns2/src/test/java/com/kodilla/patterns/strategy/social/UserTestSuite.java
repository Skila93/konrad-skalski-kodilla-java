package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User karol = new YGeneration("karol92");
        User damian = new Millenials("damian94");
        User brajan = new ZGeneration("brajan01");

        //When
        String karolIsPosting = karol.sharePost();
        System.out.println(karol.getUser() + " is posting by: " + karolIsPosting);
        String damianIsPosting = damian.sharePost();
        System.out.println(damian.getUser() + " is posting by: " + damianIsPosting);
        String brajanIsPosting = brajan.sharePost();
        System.out.println(brajan.getUser() + " is posting by: " + brajanIsPosting);

        //Then
        assertEquals("Twitter", karolIsPosting);
        assertEquals("Facebook", damianIsPosting);
        assertEquals("Snapchat", brajanIsPosting);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User karol = new YGeneration("karol92");

        //When
        String karolIsPosting = karol.sharePost();
        System.out.println(karol.getUser() + " is posting by: " + karolIsPosting);
        karol.setSocialPublisher(new FacebookPublisher());
        karolIsPosting = karol.sharePost();
        System.out.println(karol.getUser() + " now is posting by: " + karolIsPosting);

        //Then
        assertEquals("Facebook", karolIsPosting);
    }
}