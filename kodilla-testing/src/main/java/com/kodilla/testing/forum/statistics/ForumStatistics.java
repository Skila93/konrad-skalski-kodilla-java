package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double meanNumberOfPostsPerUser;
    private double meanNumberOfCommentsPerUser;
    private double meanNumberOfCommentsPerPost;
    public void  calculateAdvStatistics(Statistics statistics){
        List<String> userRetNames = statistics.userNames();

        this.numberOfUsers = userRetNames.size();

        this.numberOfPosts = statistics.postsCount();

        this.numberOfComments = statistics.commentsCount();

        this.meanNumberOfPostsPerUser = calcMeanNumberOfPostsPerUser();

        this.meanNumberOfCommentsPerUser = calcMeanNumberOfCommentsPerUser();

        this.meanNumberOfCommentsPerPost = calcMeanNumberOfCommentsPerPost();
    }
    public double calcMeanNumberOfPostsPerUser(){
        if (numberOfUsers > 0 && numberOfPosts > 0) {
            return (double)numberOfPosts / numberOfUsers;
        } else return 0;
    }
    public double calcMeanNumberOfCommentsPerUser(){
        if (numberOfUsers > 0 && numberOfComments > 0 && numberOfPosts > 0) {
            return (double)numberOfComments / numberOfUsers;
        } else return 0;
    }
    public double calcMeanNumberOfCommentsPerPost(){
        if (numberOfPosts > 0 && numberOfComments > 0 && numberOfUsers > 0) {
            return (double)numberOfComments / numberOfPosts;
        } else return 0;
    }
    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }
    public double getMeanNumberOfPostsPerUser() {
        return meanNumberOfPostsPerUser;
    }
    public double getMeanNumberOfCommentsPerUser() {
        return meanNumberOfCommentsPerUser;
    }
    public double getMeanNumberOfCommentsPerPost() {
        return meanNumberOfCommentsPerPost;
    }
    /*public void showStatistics(){
        System.out.println("Number of forum users: " + numberOfUsers);
    }*/
}
