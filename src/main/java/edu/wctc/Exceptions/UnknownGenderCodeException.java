package edu.wctc.Exceptions;

public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode){
        super("The following Gender Code is not recognized: " + genderCode);
    }
}
