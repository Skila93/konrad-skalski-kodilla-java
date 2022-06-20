package com.kodilla.testing.forum;

public class ForumComment {
    private ForumPost forumPost;
    private String cpmmentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String cpmmentBody, String author) {
        this.forumPost = forumPost;
        this.cpmmentBody = cpmmentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCpmmentBody() {
        return cpmmentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (forumPost != null ? !forumPost.equals(that.forumPost) : that.forumPost != null) return false;
        if (cpmmentBody != null ? !cpmmentBody.equals(that.cpmmentBody) : that.cpmmentBody != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }

    @Override
    public int hashCode() {
        int result = forumPost != null ? forumPost.hashCode() : 0;
        result = 31 * result + (cpmmentBody != null ? cpmmentBody.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
