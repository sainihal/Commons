package com.wavemaker.utils.exceptions;

/**
 * Created by sainihala on 11/7/16.
 */
public class AppIOException extends RuntimeException  {
    public AppIOException()
    {
        super();
    }
    public AppIOException(String ioException)
    {
        super(ioException);
    }
    public AppIOException(String ioException, Throwable cause)
    {
        super(ioException,cause);
    }
}
