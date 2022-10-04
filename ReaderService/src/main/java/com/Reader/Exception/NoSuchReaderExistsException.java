package com.Reader.Exception;

public class NoSuchReaderExistsException extends RuntimeException {
 
    private String message;
 
    public NoSuchReaderExistsException() {}
 
    public NoSuchReaderExistsException(String msg)
    {
        super(msg);
        this.message = msg;
    } 

}
