package com.drrufus.lab1server.exceptions;

public class ValidationException extends Exception {
    
    public ValidationException() {
        super();
    }
    
    public ValidationException(String message) {
        super(message);
    }
    
}
