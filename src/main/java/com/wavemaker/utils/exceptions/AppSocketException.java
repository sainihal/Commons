package com.wavemaker.utils.exceptions;

/**
 * Created by sainihala on 11/7/16.
 */
public class AppSocketException extends RuntimeException {
    public AppSocketException()
    {
        super();
    }
    public AppSocketException(String socketException)
    {
        super(socketException);
    }
    public AppSocketException(String sokcetException, Throwable cause)
    {
        super(sokcetException,cause);
    }
}
