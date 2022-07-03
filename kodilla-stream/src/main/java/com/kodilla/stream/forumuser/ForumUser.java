package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final Integer uniqueUserIdentifier;
    private final String userName;
    private final Character sex;
    private final LocalDate birthDate;
    private final int quantityOfPublishedPosts;

    public ForumUser(int uniqueUserIdentifier, String userName, Character sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int quantityOfPublishedPosts) {
        this.uniqueUserIdentifier = uniqueUserIdentifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public Integer getUniqueUserIdentifier() {
        return uniqueUserIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public Character getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPublishedPosts() {
        return quantityOfPublishedPosts;
    }
    public int getYearOfBirth(){
        return birthDate.getYear();
    }
    public int getMothOfBirth(){
        return birthDate.getMonthValue();
    }
    public int getDayOfBirth(){
        return birthDate.getDayOfMonth();
    }
    @Override
    public String toString(){
        return "Username: " + userName + ", UserNumber: " + uniqueUserIdentifier + ", sex: " + sex
                + ", DayOfBirth: "+ birthDate + ", numberOfPosts: " + quantityOfPublishedPosts;
    }
}