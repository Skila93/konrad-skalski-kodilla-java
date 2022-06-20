package com.kodilla.testing.forum;

public class ForumPost {
    private String postbody;
    private String author;

    public ForumPost(String postbody, String author) {
        this.postbody = postbody;
        this.author = author;
    }

    public String getPostbody() {
        return postbody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (postbody != null ? !postbody.equals(forumPost.postbody) : forumPost.postbody != null) return false;
        return author != null ? author.equals(forumPost.author) : forumPost.author == null;
    }

    @Override
    public int hashCode() {
        int result = postbody != null ? postbody.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
