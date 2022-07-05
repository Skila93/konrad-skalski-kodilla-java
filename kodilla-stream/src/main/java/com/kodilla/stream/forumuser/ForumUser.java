package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
/*public List<ForumUser> filter20(List<ForumUser> forumUsersList){
        List<ForumUser> returnList= new ArrayList<>();
        for(ForumUser user : forumUsersList) {
            if (getYearOfBirth() == 2002 && getMothOfBirth() <= 7 && getDayOfBirth() <= 4) {
                returnList.add(user);
            } else if(getYearOfBirth() < 2002){
                returnList.add(user);
            }
        }
        return new ArrayList<>(returnList);
    }*/

}