package ru.caf82.lectures;

public abstract class ExceptionBase extends Exception {
    public ExceptionBase() {
        super();
    }

    public  ExceptionBase(String message) {
        super(message);
    }

    public ExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionBase(Throwable cause) {
        super(cause);
    }
}