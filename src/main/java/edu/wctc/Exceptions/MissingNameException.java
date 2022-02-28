package edu.wctc.Exceptions;

public class MissingNameException extends Exception {
    public MissingNameException(String nameType){
        super("The " + nameType + " may not be blank");
    }
}
