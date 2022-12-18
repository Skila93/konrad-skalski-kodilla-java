package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {
    public static String ERR_SEARCHEMPLOYEE_ERROR = "Cannot search employee";
    public static String ERR_SEARCHCOMPANY_ERROR = "Cannot search company";

    public FacadeException(String message) {
        super(message);
    }
}