package ru.caf82.lectures;

public class IncovenientShapeExcpetion extends ExceptionBase{
    public IncovenientShapeExcpetion() {
        super();
    }
    public IncovenientShapeExcpetion(String message) {
        super(message);
    }
    public IncovenientShapeExcpetion(String message, Throwable cause) {
        super(message, cause);
    }
    public IncovenientShapeExcpetion(Throwable cause) {
        super(cause);
    }
}
