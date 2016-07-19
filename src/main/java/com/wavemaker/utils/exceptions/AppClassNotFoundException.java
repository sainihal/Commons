package com.wavemaker.utils.exceptions;

/**
 * Created by sainihala on 11/7/16.
 */
public class AppClassNotFoundException extends RuntimeException {
    public AppClassNotFoundException() {
        super();
    }
    public AppClassNotFoundException(String classNotFoud)
    {
        super(classNotFoud);
    }
    public AppClassNotFoundException(String classNotFound, Throwable cause)
    {
        super(classNotFound,cause);
    }
}
