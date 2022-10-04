package com.Author.Exception;

public class NoSuchAuthorExistsException extends RuntimeException {
 
    private String message;
 
    public NoSuchAuthorExistsException() {}
 
    public NoSuchAuthorExistsException(String msg)
    {
        super(msg);
        this.message = msg;
    } 

}
