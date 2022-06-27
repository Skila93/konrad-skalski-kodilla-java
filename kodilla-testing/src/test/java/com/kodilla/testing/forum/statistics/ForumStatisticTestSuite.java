package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {
    public List<String> usersGenerator(int usersNumb){
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersNumb; n++) {
            String theName = "Title " + n;
            resultList.add(theName);
        }
        return resultList;
    }
    @Mock
    private Statistics statisticsMock;
    @BeforeEach
    public void beforeTest(){
        List<String> list20Users = usersGenerator(20);
        when(statisticsMock.userNames()).thenReturn(list20Users);
        when(statisticsMock.postsCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(800);
    }
    @Test
    void testMeanCalculationForNumberOfPosts0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.getMeanNumberOfPostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfPosts1000(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.8, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(50, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(40, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfComments0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(2, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(0, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfCommentsLessThanNumberOfPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(4);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.1, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(2, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(0.2, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfCommentsGreaterThanNumberOfPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(20, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(2, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(40, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfUsers0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> list0Users = usersGenerator(0);
        when(statisticsMock.userNames()).thenReturn(list0Users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(0, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
    @Test
    void testMeanCalculationForNumberOfUsers110(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> list0Users = usersGenerator(100);
        when(statisticsMock.userNames()).thenReturn(list0Users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(20, forumStatistics.calcMeanNumberOfCommentsPerPost());
        Assertions.assertEquals(0.4, forumStatistics.calcMeanNumberOfPostsPerUser());
        Assertions.assertEquals(8, forumStatistics.calcMeanNumberOfCommentsPerUser());
    }
}
