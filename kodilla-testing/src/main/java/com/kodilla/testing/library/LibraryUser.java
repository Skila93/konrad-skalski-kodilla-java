package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
private String FirstName;
private String LastName;
private String peselId;

    public LibraryUser(String firstName, String lastName, String peselId) {
        FirstName = firstName;
        LastName = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(FirstName, that.FirstName) &&
                Objects.equals(LastName, that.LastName) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, peselId);
    }
}
