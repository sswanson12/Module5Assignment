package edu.wctc.Exceptions;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super("The given Year: " + year + " - Month: " + month + " - and Day: " + day + " are invalid.");
    }
}
