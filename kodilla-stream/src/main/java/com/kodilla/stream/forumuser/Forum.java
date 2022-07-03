package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(0001, "forumUser1", 'M',2000,
                7, 20, 6));
        forumUsersList.add(new ForumUser(0002, "forumUser2", 'F',2010,
                5, 22, 89));
        forumUsersList.add(new ForumUser(0003, "forumUser3", 'M',2011,
                2, 12, 655));
        forumUsersList.add(new ForumUser(0004, "forumUser4", 'F',1994,
                11, 14, 61));
        forumUsersList.add(new ForumUser(0005, "forumUser5", 'M',1990,
                4, 16, 12));
        forumUsersList.add(new ForumUser(0006, "forumUser6", 'F',1982,
                2, 6, 0));
    }
        public List<ForumUser> getUserList(){
            return new ArrayList<>(forumUsersList);
        }
}
