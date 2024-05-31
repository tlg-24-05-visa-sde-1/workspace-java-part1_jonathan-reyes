package com.hr;

/*
     This is  more HR oriented, higher-level exception type
*/

public class WorkException extends Exception {
    public WorkException() {
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }
}