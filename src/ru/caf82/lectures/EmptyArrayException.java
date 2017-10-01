package ru.caf82.lectures;

import sun.invoke.empty.Empty;

public class EmptyArrayException extends ExceptionBase{
    public EmptyArrayException() {
        super();
    }
    public EmptyArrayException(String message) {
        super(message);
    }
    public EmptyArrayException(String message, Throwable cause) {
        super(message, cause);
    }
    public EmptyArrayException(Throwable cause) {
        super(cause);
    }
}

